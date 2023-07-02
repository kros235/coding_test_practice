package etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_9613 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int round = Integer.parseInt(br.readLine());
        for (int i = 0; i < round; i++) {
            StringTokenizer st = new StringTokenizer( br.readLine() );
            int number_count    =   Integer.parseInt( st.nextToken() );
            long[] number_array  =   new long[ number_count ];
            for (int j = 0 ; j < number_count ; j++ )
                number_array[j] = Integer.parseInt( st.nextToken() );

            Arrays.sort ( number_array );
            long gcd_sum =   0;
            for (int j = 0 ; j < number_count-1 ; j++ ) {
                for (int k = j+1 ; k < number_count ; k++ ) {
                    gcd_sum += get_gcd ( number_array[k], number_array[j] );
                }
            }
            sb.append( gcd_sum + "\n");
        }

        bw.write( String.valueOf( sb ) );
        bw.flush();
        br.close();
        bw.close();
    }

    private static long get_gcd(long a, long b) {
        if ( a % b != 0 )
            return get_gcd( b, a % b );
        else
            return b;
    }

}
