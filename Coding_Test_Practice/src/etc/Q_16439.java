package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_16439 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int human    =   Integer.parseInt( st.nextToken() );
        int chicken  =   Integer.parseInt( st.nextToken() );
        int[][] preference  =   new int[ human ] [ chicken ];

        for ( int i = 0 ; i < human ; i++ ){
            st  =   new StringTokenizer( br.readLine() );
            for ( int j = 0 ; j < chicken ; j++ )
                preference[i][j]    =   Integer.parseInt( st.nextToken() );

        }

        int max =   -1;

        for ( int i = 0 ; i < chicken ; i++ ){
            for ( int j = 0 ; j < chicken ; j++ ){
                for ( int k = 0 ; k < chicken ; k++ ){
                    if ( i != j && i != k && j != k) {
                        int sum = 0;
                        for (int m = 0; m < human; m++) {
                            sum += find_max(preference[m][i], preference[m][j], preference[m][k]);
                        }
                        if (max < sum)
                            max = sum;
                    }
                }
            }
        }
        sb.append( max + "\n");
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

    private static int find_max(int i, int j, int k) {
        if ( i > j ){
            if ( i > k )
                return i;
            else
                return k;
        }
        else{
            if ( j > k )
                return j;
            else
                return k;
        }
    }
}
