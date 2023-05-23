package etc;

import java.io.*;

public class Q_10480 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int round = Integer.parseInt(br.readLine());

        for (int i = 0; i < round; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input % 2 == 0)
                sb.append(input + " is even\n");
            else
                sb.append(input + " is odd\n");
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
