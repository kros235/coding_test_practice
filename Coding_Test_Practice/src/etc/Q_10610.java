package etc;

import java.io.*;
import java.util.Arrays;

public class Q_10610 {

    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        String[] letters        =   new String[ input.length() ];
        boolean zero_checker    =   false;
        int letter_sum          =   0;

        for ( int i = 0 ; i < input.length() ; i++ ) {
            letters[i]   =  String.valueOf(input.charAt(i));
            letter_sum  +=  Integer.parseInt( String.valueOf( input.charAt(i) ) );
            if ( String.valueOf(input.charAt(i)).equals("0") )
                zero_checker = true;
        }

        if ( zero_checker == false || letter_sum % 3 != 0 )
            sb.append ("-1\n");
        else{
            Arrays.sort ( letters );
            for ( int i = letters.length-1 ; i >= 0 ; i-- )
                sb.append( letters[i] );
            sb.append( "\n" );
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
