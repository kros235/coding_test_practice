package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q_11660_re {

    public static int[][] calculate_parital_sum(int[][] original_arrays){
        int[][] partial_sum_arrays  =   new int[original_arrays.length][original_arrays.length];

        partial_sum_arrays[0][0]    =   original_arrays[0][0];

        // fill first horizontal row
        for ( int i = 1 ; i < partial_sum_arrays.length ; i++ )
            partial_sum_arrays[i][0]    =   partial_sum_arrays[i-1][0] + original_arrays[i][0];

        // fill first vertical row
        for ( int i = 1 ; i < partial_sum_arrays.length ; i++ )
            partial_sum_arrays[0][i]    =   partial_sum_arrays[0][i-1] + original_arrays[0][i];


        // get rest sum
        for ( int i = 1 ; i < partial_sum_arrays.length ; i++ ){

            for ( int j = 1 ; j < partial_sum_arrays.length ; j++ ){
                partial_sum_arrays[i][j]    =
                        partial_sum_arrays[i-1][j] + partial_sum_arrays[i][j-1]
                                - partial_sum_arrays[i-1][j-1] + original_arrays[i][j];
            }
        }
        return partial_sum_arrays;
    }

    public static int get_area_sum(int[][] partial_sum_arrays, int x1, int y1, int x2, int y2){
        int result =  0;

        if ( (x1 - 1) -1 < 0 && (y1 - 1) -1 < 0 ){
            return partial_sum_arrays[x2 -1][y2 - 1];
        }

        else if ( (x1 - 1) -1 < 0 ){
            return partial_sum_arrays[x2 -1][y2 - 1]
                    - ( partial_sum_arrays[x2 - 1][(y1 - 1) - 1]);
        }

        else if( (y1 - 1) -1 < 0 ){
            return partial_sum_arrays[x2 -1][y2 - 1]
                    - ( partial_sum_arrays[(x1 - 1) - 1][(y2 - 1)]);
        }

        else {
            return partial_sum_arrays[x2 -1][y2 - 1]
                    - ( partial_sum_arrays[(x1 - 1) - 1][(y2 - 1)] + partial_sum_arrays[x2 - 1][(y1 - 1) - 1])
                    + partial_sum_arrays[(x1 - 1) - 1][(y1 - 1) - 1];
        }
    }


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb    =   new StringBuilder();
        StringTokenizer st  =   new StringTokenizer( br.readLine() );

        int size    =   Integer.parseInt( st.nextToken() );
        int rounds  =   Integer.parseInt( st.nextToken() );

        int[][] original_arrays     =   new int[size][size];
        int[][] partial_sum_arrays  =   new int[size][size];

        // insert
        for ( int i = 0 ; i < size ; i++ ) {
            st = new StringTokenizer( br.readLine());
            for (int j = 0; j < size; j++)
                original_arrays[i][j]   =   Integer.parseInt( st.nextToken() );
        }

        partial_sum_arrays  =   calculate_parital_sum( original_arrays );


        // calculate target area sum
        for ( int i = 0 ; i < rounds ; i++ ) {
            st = new StringTokenizer( br.readLine());

            int x1  =   Integer.parseInt( st.nextToken() );
            int y1  =   Integer.parseInt( st.nextToken() );
            int x2  =   Integer.parseInt( st.nextToken() );
            int y2  =   Integer.parseInt( st.nextToken() );

            int result  =   get_area_sum ( partial_sum_arrays , x1, y1, x2, y2);
            sb.append( result + "\n");
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }
}
