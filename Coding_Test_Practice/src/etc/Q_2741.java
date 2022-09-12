package etc;

import java.io.*;

public class Q_2741 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder input = new StringBuilder(br.readLine());
        int round = Integer.parseInt(input.toString());

        if (round < 0 || round > 100000) {
        } else {

            for (int i = 1; i <= round; i++) {
                bw.write(String.valueOf(i) + "\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();

    }

}
