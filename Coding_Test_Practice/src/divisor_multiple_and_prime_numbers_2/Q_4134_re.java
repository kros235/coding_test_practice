package divisor_multiple_and_prime_numbers_2;

import java.io.*;

public class Q_4134_re {

    public static void main(String args[]) throws IOException {

        BufferedReader br   =   new BufferedReader ( new InputStreamReader( System.in ) );
        BufferedWriter bw   =   new BufferedWriter ( new OutputStreamWriter( System.out ) );
        StringBuilder sb    =   new StringBuilder();

        int round           =   Integer.parseInt ( br.readLine() );

        //System.out.println( " (int) Math.sqrt ( 4 * Math.pow(10,9) )   = " + (int) Math.sqrt ( 4 * Math.pow(10,9) )   );



        for ( int i = 0 ; i < round ; i++ ){

            long n           =   Long.parseLong ( br.readLine() );
            sb.append ( prime_nest( n ) + "\n" );
        }

        bw.write ( sb.toString() );
        br.close();
        bw.close();
    }


    public static long prime_nest ( long n ){

        if (n <= 2){
            return 2;
        }

        while ( true ) {
            boolean prime_flag = true;
            for (int i = 2; i < Math.sqrt(n) + 1; i++) {
                if (n % i == 0) {
                    prime_flag = false;
                    break;
                }
            }

            if (prime_flag == true)
                return n;
            n++;
        }
    }
}
