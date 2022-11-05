package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_9086 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int round = Integer.parseInt(br.readLine());

        if (round >= 1 && round <= 10) {

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < round; i++) {
                String input = br.readLine();
                sb.append( String.valueOf( input.charAt(0) ) + String.valueOf( input.charAt(input.length() - 1) ) + "\n");
            }
            bw.write(String.valueOf(sb));
        }

        bw.flush();
        br.close();
        bw.close();
    }

}
