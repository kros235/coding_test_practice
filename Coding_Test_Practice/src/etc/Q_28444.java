package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_28444 {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int hi  =   1;
        int arc =   1;

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        for ( int i = 0 ; i < 5 ; i++ ) {
            if ( i <= 1 )
                hi *= Integer.parseInt( st.nextToken() );
            else
                arc *= Integer.parseInt( st.nextToken() );
        }

        sb.append( hi-arc + "\n");
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();

    }

}
