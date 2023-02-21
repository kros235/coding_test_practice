package one_dimensional_array;

import java.io.*;
import java.util.StringTokenizer;

public class Q_10811 {
    public static int[] reverse ( int[] basket, int start, int end){
        int[] result    =   new int[basket.length];

        for ( int i = 0 ; i < start ; i++ )
            result[i]   =   basket[i];

        int counter =   start;
        for ( int i = end ; i >= start ; i-- )
            result[counter++]   =   basket[i];

        if ( end + 1 <= result.length ) {
            for (int i = end + 1; i < result.length; i++)
                result[i] = basket[i];
        }

        return  result;
    }
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
            int start       =   Integer.parseInt( st.nextToken() );
            int end         =   Integer.parseInt( st.nextToken() );

            basket          =   reverse ( basket, start, end);
        }

        for ( int i = 1 ; i < array_size ; i++ )
            sb.append( basket[i] + " ");

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
