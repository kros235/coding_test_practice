package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q_2420 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer( br.readLine() );

        BigInteger first = new BigInteger( st.nextToken() );
        BigInteger second = new BigInteger( st.nextToken() );
        BigInteger result;

        if (first.subtract(second).compareTo(BigInteger.valueOf(0)) < 0)
            result = first.subtract(second).multiply(BigInteger.valueOf(-1));
        else
            result = first.subtract(second);

        bw.write(String.valueOf(result) + "\n");

        bw.flush();
        br.close();
        bw.close();
    }

}
