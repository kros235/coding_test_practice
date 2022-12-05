package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q_18096 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input           =   Integer.parseInt( br.readLine() );

        StringBuilder sb = new StringBuilder();
        sb.append( "1\n");
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
