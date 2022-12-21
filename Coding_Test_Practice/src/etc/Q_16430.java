package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_16430 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        StringBuilder sb    =   new StringBuilder();

        int a   =   Integer.parseInt( st.nextToken() );
        int b   =   Integer.parseInt( st.nextToken() );

        sb.append( (b-a) + " " + b );
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
