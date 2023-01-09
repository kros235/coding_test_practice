package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_2442 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int round = Integer.parseInt(br.readLine());
        int counter = 0;

        for (int i = 1; i <= round * 2 ; i+=2) {

            for (int j = (round - 1) - counter   ; j > 0 ; j--)
                sb.append(" ");

            for (int k = 1; k <= i; k++)
                sb.append("*");

            sb.append("\n");
            counter++;
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
