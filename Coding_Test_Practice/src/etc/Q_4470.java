package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_4470 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int rounds       =  Integer.parseInt( br.readLine() );

        for (int i = 1; i <= rounds; i++)
            sb.append(i + ". " + br.readLine() + "\n");

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();

    }
}

