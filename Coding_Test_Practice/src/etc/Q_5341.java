package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.HashMap;

public class Q_5341 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        while ( true ){
            int input   =   Integer.parseInt( br.readLine() );
            if ( input != 0 ){
                sb.append( get_sum( input ) + "\n");
            }
            else
                break;
        }

        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

    private static int get_sum(int input) {
        int sum = 0 ;
        for ( int i = 1 ; i <= input ; i ++)
            sum += i;
        return sum;
    }
}
