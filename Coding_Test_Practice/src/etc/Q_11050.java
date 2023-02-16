package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_11050 {

    // ====================================================================
    //  n C r   =   factorial(n) / ( factorial( n - r ) * factorial( r ) );
    // ====================================================================

    public static int factorial( int input ) {

        while ( true ) {
            if (input == 0)
                return 1;
            else
                return input * factorial( input - 1 );
        }
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );

        int n   =   Integer.parseInt( st.nextToken() );
        int r   =   Integer.parseInt( st.nextToken() );

        int result  =   factorial(n) / ( factorial( n - r ) * factorial( r ) );

        sb.append( result + "\n");
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
