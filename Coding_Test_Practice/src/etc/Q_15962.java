package etc;

import java.io.*;
import java.math.BigInteger;

public class Q_15962 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String name = br.readLine();

        StringBuilder sb = new StringBuilder();
        sb.append( "파이팅!!" );
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
