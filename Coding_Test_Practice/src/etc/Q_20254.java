package etc;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q_20254 {



    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );

        long ur =   Long.parseLong( st.nextToken() ) * 56;
        long tr =   Long.parseLong( st.nextToken() ) * 24;
        long uo =   Long.parseLong( st.nextToken() ) * 14;
        long to =   Long.parseLong( st.nextToken() ) * 6;
        sb.append ( ur + tr + uo + to );

        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

}
