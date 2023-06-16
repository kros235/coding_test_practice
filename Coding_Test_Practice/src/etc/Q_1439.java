package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_1439 {

    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String input          =   br.readLine();
        int zero_group_count  =   0;
        int one_group_count   =   0;

        String first_digit       =   String.valueOf( input.charAt(0) );
        if ( Integer.parseInt( first_digit ) == 0 )
            zero_group_count++;
        else
            one_group_count++;

        for ( int i = 0 ; i < input.length() ; i++ ){
            if ( !first_digit.equals( String.valueOf( input.charAt(i) ) ) ){

                if ( Integer.parseInt( String.valueOf( input.charAt(i) ) ) == 0 )
                    zero_group_count++;
                else
                    one_group_count++;

                first_digit  =   String.valueOf( input.charAt(i) );
            }
            else
                continue;
        }

        if ( zero_group_count < one_group_count )
            sb.append ( zero_group_count + "\n");
        else
            sb.append ( one_group_count + "\n");

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
