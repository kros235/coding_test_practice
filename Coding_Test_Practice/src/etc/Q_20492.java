package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_20492 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int original_prize = Integer.parseInt( br.readLine() );

        StringBuilder sb = new StringBuilder();
        sb.append( (int)(original_prize * 0.78) + " " + (int)(original_prize * 0.8 + ( (original_prize * 0.2) * 0.78 ) ) );
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();

    }
}

