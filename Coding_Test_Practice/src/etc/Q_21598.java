package etc;

import java.io.*;

public class Q_21598 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int round   =   Integer.parseInt( br.readLine() );
        for ( int i = 0 ; i < round ; i++ )
            sb.append("SciComLove\n");

        bw.append(sb);
        bw.flush();
        br.close();
        bw.close();
    }
}
