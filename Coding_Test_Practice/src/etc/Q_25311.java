package etc;

import java.io.*;

public class Q_25311 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        sb.append("A\n");
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }
}

