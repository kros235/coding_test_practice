package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_2018_re {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt( br.readLine() );
        int result  =   0;

        int[] sum_array =   new int [n];
        sum_array[0]    =   1;

        for ( int i = 2 ; i <= n ; i++ )
            sum_array[i - 1] = sum_array[i - 2] + i;

        int start_index     =   0;
        int end_index       =   0;

        while ( end_index != n ){

            if ( sum_array[ end_index ] - sum_array[ start_index ]+ (start_index+1)  < n ){
                end_index++;
            }

            else if ( sum_array[ end_index ] - sum_array[ start_index ]+ (start_index+1)  > n ){
                start_index++;
            }

            else{
                result++;
                end_index++;
            }
        }

        sb.append ( result );
        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

}
