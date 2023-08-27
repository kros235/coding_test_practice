package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_20499 {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine() , "/");
        long kill         =   Long.parseLong( st.nextToken() );
        long death        =   Long.parseLong( st.nextToken() );
        long assist       =   Long.parseLong( st.nextToken() );

        if ( kill + assist < death || death == 0 )
            sb.append ("hasu\n");
        else
            sb.append ( "gosu\n");


        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();

    }

}
