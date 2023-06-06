package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q_2490 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                if (Integer.parseInt(st.nextToken()) == 0)
                    count++;
            }
            switch (count) {
                case 1: {
                    sb.append("A\n");
                    break;
                }
                case 2: {
                    sb.append("B\n");
                    break;
                }
                case 3: {
                    sb.append("C\n");
                    break;
                }
                case 4: {
                    sb.append("D\n");
                    break;
                }
                default: {
                    sb.append("E\n");
                    break;
                }
            }
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
