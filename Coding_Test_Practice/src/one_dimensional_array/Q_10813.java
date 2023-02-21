package one_dimensional_array;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_10813 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int array_size      =   Integer.parseInt( st.nextToken() ) + 1;
        int rounds          =   Integer.parseInt( st.nextToken() );

        int[] basket        =   new int[ array_size ];
        for ( int i = 1 ; i < array_size ; i++ )
            basket[i]   =   i;

        for ( int i = 0 ; i < rounds ; i++ ){
            st              =   new StringTokenizer( br.readLine() );
            int target_1    =   Integer.parseInt( st.nextToken() );
            int target_2    =   Integer.parseInt( st.nextToken() );

            int temp        =   basket[target_1];
            basket[target_1]=   basket[target_2];
            basket[target_2]=   temp;
        }

        for ( int i = 1 ; i < array_size ; i++ )
            sb.append( basket[i] + " ");

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
