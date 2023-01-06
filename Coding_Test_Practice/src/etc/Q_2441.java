package etc;

import java.io.*;

public class Q_2441 {



    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int round = Integer.parseInt(br.readLine());

        for (int i = 0; i < round; i++) {

            for (int j = 0; j < i; j++)
                sb.append(" ");

            for (int k = round; k > i; k--)
                sb.append("*");

            sb.append("\n");
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
