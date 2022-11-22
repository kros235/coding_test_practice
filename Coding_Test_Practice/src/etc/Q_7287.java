package etc;

import java.io.*;

public class Q_7287 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        sb.append("130\n" + "kros235");
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();

    }

}
