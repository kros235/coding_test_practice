package one_dimensional_array;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q_10810 {
    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int array_size      =   Integer.parseInt( st.nextToken() ) + 1;
        int rounds          =   Integer.parseInt( st.nextToken() );

        int[] basket        =   new int[ array_size ];
        Arrays.fill( basket, 0);

        for ( int i = 0 ; i < rounds ; i++ ){
            st          =   new StringTokenizer( br.readLine() );
            int start   =   Integer.parseInt( st.nextToken() );
            int end     =   Integer.parseInt( st.nextToken() );
            int number  =   Integer.parseInt( st.nextToken() );

            for ( int j = start ; j <= end ; j++ )
                basket[j]   =   number;
        }

        for ( int i = 1 ; i < array_size ; i++ )
            sb.append( basket[i] + " ");

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
