package divisor_multiple_and_prime_numbers_2;

import java.io.*;
import java.util.StringTokenizer;

public class Q_2485 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int amount      =   Integer.parseInt( br.readLine() );
        long[] trees     =   new long[ amount ];
        long[] intervals =   new long[ amount-1 ];

        long before = 0, after = 0, count = 0;
        for ( int i = 0 ; i < amount ; i++ ){
            trees[i]    =   Integer.parseInt( br.readLine() );
            if ( i == 0 ) {
                before = trees[i];
                continue;
            }
            else{
                after = trees[i];
                intervals[(int) count++] = after - before;
                before = after;
            }
        }

        long GCM    =   find_GCM( intervals );
        long result =   count_missing_tress ( trees , GCM );

        sb.append( result );
        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();

    }

    private static long count_missing_tress(long[] trees, long GCM) {
        long count = 0 ;
        for ( int i = 1 ; i < trees.length ; i++ ){
            long temp = trees[i-1] + GCM;
            while ( trees[i] > temp ){
                count++;
                temp += GCM;
            }
        }
        return count;
    }

    private static long find_GCM(long[] intervals) {
        long GCM    =   1;
        long min    =   1000000001;


        while ( true ) {

            boolean dividable   =   false;

            // find min
            for (int i = 0; i < intervals.length; i++) {
                if ( min > intervals[i] )
                    min = intervals[i];
            }

            for ( int i = 2 ; i <= min ; i++ ){

                if ( dividable_checker( intervals, i ) == true ) {
                    GCM *= i ;
                    intervals   =   divider ( intervals, i);
                    dividable   =   true;
                    break;
                }
            }

            if ( dividable == false )
                break;
        }

        return GCM;
    }

    private static long[] divider(long[] intervals, int num) {
        for ( int i = 0 ; i < intervals.length ; i++ ){
            intervals[i]    =   intervals[i] / num;
        }
        return intervals;
    }

    private static boolean dividable_checker(long[] intervals, int num) {
        for (int i = 0; i < intervals.length; i++) {
            if ( intervals[i] % num == 0 ){
                continue;
            }
            else
                return false;
        }
        return  true;
    }
}
