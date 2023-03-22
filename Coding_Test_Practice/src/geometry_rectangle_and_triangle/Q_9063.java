package geometry_rectangle_and_triangle;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_9063 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int A   =   Integer.parseInt ( br.readLine() );
        int[] x =   new int[A];
        int[] y =   new int[A];

        for ( int i = 0 ; i < A ; i++ ){
            StringTokenizer st  =   new StringTokenizer( br.readLine() );
            x[i] =  ( Integer.parseInt( st.nextToken() ) );
            y[i] =  ( Integer.parseInt( st.nextToken() ) );
        }

        Arrays.sort( x );
        Arrays.sort( y );

        int x_length    =   Math.abs ( x[x.length-1] - x[0] );
        int y_length    =   Math.abs ( y[x.length-1] - y[0] );

        sb.append( ( x_length * y_length) );
        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

}
