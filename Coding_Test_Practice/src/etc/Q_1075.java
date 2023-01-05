package etc;

import java.io.*;

public class Q_1075 {

    public static String find_dividable(long n, long f) {

        String result = "";

        for (int i = 0; ; i++) {

            if ((n + i) % f == 0) {

                result = String.valueOf(n + i).substring(String.valueOf(n + i).length() - 2, String.valueOf(n + i).length());
                break;

            } else continue;
        }

        return result;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        long f = Long.parseLong(br.readLine());

        long modified_n = Long.parseLong(n.substring(0, n.length() - 2) + "00");


        String result = find_dividable(modified_n, f);

        StringBuilder sb = new StringBuilder();

        sb.append(result);

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
