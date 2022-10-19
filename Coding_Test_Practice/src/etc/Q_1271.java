package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q_1271 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer( br.readLine() );

        BigInteger amount = new BigInteger(st.nextToken());
        BigInteger candidate = new BigInteger(st.nextToken());



        StringBuilder sb = new StringBuilder();
        sb.append( amount.divide(candidate) + "\n" );
        sb.append( amount.mod(candidate) + "\n");

        bw.write( String.valueOf(sb) );



        bw.flush();
        br.close();
        bw.close();
    }

}
