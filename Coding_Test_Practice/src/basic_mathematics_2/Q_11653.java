package basic_mathematics_2;

import java.io.*;
import java.util.ArrayList;

public class Q_11653 {
    public static long prime_factorization(long digit) {

        for ( int i = 2 ; i <= digit ; i++){
            if( digit % i  == 0)
                return i;
        }
        return 1;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Long> result = new ArrayList<>();

        String input    =   br.readLine();
        long digit       =   Integer.parseInt( input );

        if ( digit < 1 || digit > 10000000) {
        } else {
            long temp = digit;
            if ( digit != 1 ){
                while(true) {
                    if(temp != 1) {
                        long divider = prime_factorization ( temp );
                        temp /= divider;
                        result.add( divider );
                    }
                    else
                        break;
                }

                for ( int i = 0 ; i < result.size() ; i++)
                    bw.write( String.valueOf( result.get(i)  ) + "\n" );
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
