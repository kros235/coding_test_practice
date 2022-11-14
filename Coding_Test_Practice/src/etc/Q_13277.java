package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q_13277 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer( br.readLine() );

        BigInteger a = new BigInteger( st.nextToken() );
        BigInteger b = new BigInteger( st.nextToken() );

        StringBuilder sb = new StringBuilder();
        sb.append( a.multiply(b) );
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
