package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q_22193 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int length_A        =   Integer.parseInt( st.nextToken() );
        int length_B        =   Integer.parseInt( st.nextToken() );
        BigInteger A        =   new BigInteger( br.readLine() );
        BigInteger B        =   new BigInteger( br.readLine() );

        StringBuilder sb = new StringBuilder();
        bw.write(A.multiply(B) + "\n");

        bw.flush();
        br.close();
        bw.close();
    }

}
