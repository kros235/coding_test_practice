package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_5347 {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int round   =   Integer.parseInt( br.readLine() );
        for ( int i = 0 ; i < round ; i++ ){
            StringTokenizer st  =   new StringTokenizer ( br.readLine() );
            long a    =   Long.parseLong( st.nextToken() );
            long b    =   Long.parseLong( st.nextToken() );

            long gcd;
            if ( a > b )
                gcd =   get_gcd ( a, b );
            else
                gcd =   get_gcd ( b, a );
            long lcm =   ( a * b ) / gcd ;
            sb.append( lcm + "\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

    private static long get_gcd(long a, long b) {
        if ( a % b != 0 )
            return get_gcd( b, ( a % b ) );
        else
            return b;
    }
}
