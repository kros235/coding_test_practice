package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q_14490 {

    public static void main(String args[]) throws IOException {

        BufferedReader br   = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw   = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb    = new StringBuilder();
        StringTokenizer st  =   new StringTokenizer( br.readLine(), ":", false);

        int a   =   Integer.parseInt( st.nextToken() );
        int b   =   Integer.parseInt( st.nextToken() );

        sb.append( find_gcd ( a, b ) );
        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

    private static String find_gcd(int a, int b) {
        int smaller_num;
        if ( a < b )    smaller_num =   a;
        else            smaller_num =   b;

        while ( true ) {
            boolean divide_check    =   false;
            for (int i = 2; i <= smaller_num; i++) {
                if ( a % i == 0 && b % i == 0 ){
                    a/=i;
                    b/=i;
                    divide_check = true;
                }

            }
            if ( divide_check == false )
                break;
        }

        return a + ":" + b;
    }
}
