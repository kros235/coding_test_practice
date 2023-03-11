package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_10986_re {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] array     = new long[n];
        long[] remainder = new long[m];

        st = new StringTokenizer(br.readLine());

        long result  =   0;

        array[0]    =   Integer.parseInt(st.nextToken());
        for (int i = 1; i < n; i++) {
            array[i] = ( array[i - 1] + Integer.parseInt( st.nextToken() ) );
        }

        for (int i = 0; i < n; i++) {
            int left_over   =   (int) (array[i] % m);
            if ( left_over == 0 )
                result++;
            remainder[ left_over ] ++;
        }


        for ( int i = 0 ; i < m ; i++ ){
            if ( remainder[i] > 1 )
                result += ( remainder[i] * ( remainder[i] - 1)  / 2);
        }

        sb.append ( result );

        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
