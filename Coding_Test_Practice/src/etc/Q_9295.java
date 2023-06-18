package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_9295 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int round   =   Integer.parseInt( br.readLine() );

        for ( int i = 1 ; i <= round ; i++ ) {
            StringTokenizer st  =   new StringTokenizer( br.readLine() );
            int sum =   Integer.parseInt( st.nextToken() ) + Integer.parseInt( st.nextToken() );
            sb.append("Case " + i + ": " + sum + "\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
