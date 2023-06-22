package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_15700 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        long width = Long.parseLong( st.nextToken() );
        long height = Long.parseLong( st.nextToken() );
        long wall_size   =   width * height;

        sb.append ( ( wall_size / 2 ) + "\n");
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
