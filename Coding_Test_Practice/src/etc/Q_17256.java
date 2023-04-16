package etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_17256 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int ax  =   Integer.parseInt( st.nextToken() );
        int ay  =   Integer.parseInt( st.nextToken() );
        int az  =   Integer.parseInt( st.nextToken() );

        st  =   new StringTokenizer( br.readLine() );
        int cx  =   Integer.parseInt( st.nextToken() );
        int cy  =   Integer.parseInt( st.nextToken() );
        int cz  =   Integer.parseInt( st.nextToken() );

        sb.append( (cx - az) + " " + (cy / ay) + " " + (cz - ax));
        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
