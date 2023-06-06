package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_10817 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[] digits   = new int[3];

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        for ( int i = 0 ; i < 3 ; i++ )
            digits[i]    =   Integer.parseInt( st.nextToken() );

        Arrays.sort ( digits );


        sb.append ( digits[1] + "\n");
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
