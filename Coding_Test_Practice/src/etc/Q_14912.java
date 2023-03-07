package etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_14912 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int range           =   Integer.parseInt( st.nextToken() );
        String target       =   st.nextToken();

        int sum            =   0;
        for ( int i = 1 ; i <= range ; i++ )
            sum += check_value ( String.valueOf( i ) , target );

        sb.append( sum );
        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

    private static int check_value(String input, String target) {
        int count   =   0   ;
        for ( int i = 0 ; i < input.length() ; i++ ){
            if ( String.valueOf( input.charAt(i) ).equals( target ) == true )
                count++;
        }
        return count;
    }

}
