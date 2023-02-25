package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_24736 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        for ( int i = 0 ; i < 2 ; i++ ) {
            StringTokenizer st  =   new StringTokenizer( br.readLine() );
            int T   =   Integer.parseInt( st.nextToken() ) * 6;
            int F   =   Integer.parseInt( st.nextToken() ) * 3;
            int S   =   Integer.parseInt( st.nextToken() ) * 2;
            int P   =   Integer.parseInt( st.nextToken() ) * 1;
            int C   =   Integer.parseInt( st.nextToken() ) * 2;

            sb.append ( (T + F + S + P + C) + " " );
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
