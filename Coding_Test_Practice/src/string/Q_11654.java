package string;

import java.io.*;

public class Q_11654 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        char line = input.charAt(0);
        int n = (int)line;

        bw.write( String.valueOf(n) );

        bw.flush();
        br.close();
        bw.close();
    }

}
