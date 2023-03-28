package brute_force;

import java.io.*;
import java.util.StringTokenizer;

public class Q_19532 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());


        int[] digit = new int[6];
        for (int i = 0; i < 6; i++)
            digit[i] = Integer.parseInt(st.nextToken());

        boolean found = false;
        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if ((digit[0] * i + digit[1] * j == digit[2])
                        && (digit[3] * i + digit[4] * j == digit[5]))
                    sb.append(i + " " + j);
            }
            if (found == true)
                break;
        }

        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();

    }
}
