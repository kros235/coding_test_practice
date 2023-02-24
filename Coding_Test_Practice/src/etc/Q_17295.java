package etc;

import java.io.*;

public class Q_17295 {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        sb.append("Avengers: Endgame\n");

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
