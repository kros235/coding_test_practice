package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q_4101 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();;
        while (true) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            if (first == 0 && second == 0)
                break;
            else {
                if (first > second)
                    sb.append("Yes\n");
                else
                    sb.append("No\n");
            }

        }

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
