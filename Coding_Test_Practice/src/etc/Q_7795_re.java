package etc;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_7795_re {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int round       =   Integer.parseInt( br.readLine() ) ;

        for ( int i = 0 ; i < round ; i++ ){
            StringTokenizer st  =   new StringTokenizer( br.readLine() );
            int sizeA   =   Integer.parseInt( st.nextToken() );
            int sizeB   =   Integer.parseInt( st.nextToken() );

            int[] setA  =   new int [ sizeA ];
            int[] setB  =   new int [ sizeB ];

            st  =   new StringTokenizer( br.readLine() );
            for ( int j = 0 ; j < sizeA ; j++)
                setA[j] =   Integer.parseInt( st.nextToken() );

            st  =   new StringTokenizer( br.readLine() );
            for ( int j = 0 ; j < sizeB ; j++)
                setB[j] =   Integer.parseInt( st.nextToken() );

            int result  =   get_result ( setA, setB );
            sb.append( result + "\n");
        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

    private static int get_result(int[] setA, int[] setB) {
        int result  =   0;

        Arrays.sort( setB );

        for ( int i = 0 ; i < setA.length ; i++ )
            result  +=  binary_search( setA[i], setB );

        return result;
    }

    private static int binary_search(int num, int[] setB) {
        int start   =   0;
        int end     =   setB.length-1;
        int mid     =    ( start + end ) / 2;
        boolean found   =   false;
        while( start <= end ){
            mid =   ( start + end ) / 2;
            if ( setB[mid] < num )
                start   =   mid + 1;
            else
                end     =   mid - 1;
        }
        return start;
    }

}
