package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_2443 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int round = Integer.parseInt(br.readLine());

        for (int i = round; i > 0; i--) {

            for (int k = 0; k < round - i; k++)
                sb.append(" ");

            for (int j = 0; j < 2 * i - 1; j++)
                sb.append("*");

            sb.append("\n");
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
