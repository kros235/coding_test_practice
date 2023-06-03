package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_11549 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int tea    =   Integer.parseInt( br.readLine() );
        StringTokenizer st  =   new StringTokenizer( br.readLine() );

        int count = 0;
        for ( int i = 0 ; i < 5 ; i++ )
            if ( tea == Integer.parseInt( st.nextToken() ) )
                count++;
        sb.append ( count + "\n");
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
