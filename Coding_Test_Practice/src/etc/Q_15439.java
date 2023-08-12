package etc;

import java.io.*;

public class Q_15439 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int uniform = Integer.parseInt(br.readLine());

        sb.append ( (uniform) * (uniform-1) + "\n" );
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
