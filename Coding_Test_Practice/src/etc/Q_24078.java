package etc;

import java.io.*;
import java.math.BigInteger;

public class Q_24078 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int digit = Integer.parseInt(br.readLine());

        sb.append((digit % 21));
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
