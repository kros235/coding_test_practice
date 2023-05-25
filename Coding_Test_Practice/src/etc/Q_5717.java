package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q_5717 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while( true ) {

            String input = br.readLine();
            if (!input.equals("0 0")) {
                StringTokenizer st = new StringTokenizer(input);
                int boys = Integer.parseInt(st.nextToken());
                int girls = Integer.parseInt(st.nextToken());

                sb.append((boys + girls) + "\n");
            }
            else
                break;
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
