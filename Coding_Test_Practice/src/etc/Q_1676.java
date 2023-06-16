package etc;

import java.io.*;
import java.math.BigInteger;

public class Q_1676 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int input = Integer.parseInt( br.readLine());
        BigInteger result   =   new BigInteger( "1" );

        for ( int i = 2 ; i <= input ; i++ )
            result = result.multiply( new BigInteger( String.valueOf( i ) ) );


        String factorial_result =   String.valueOf( result );
        int count   =   0;
        for ( int i = factorial_result.length()-1 ; i >= 0 ; i-- ){
            if ( String.valueOf( factorial_result.charAt(i) ).equals( "0" ) )
                count++;
            else
                break;
        }

        sb.append(count + "\n");
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();

    }

}
