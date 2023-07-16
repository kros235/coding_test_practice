package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_28113 {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        Long N  =   Long.parseLong( st.nextToken() );
        Long A  =   Long.parseLong( st.nextToken() );
        Long B  =   Long.parseLong( st.nextToken() );

        if ( B < A )
            sb.append("Subway\n");
        else if ( B > A )
            sb.append("Bus\n");
        else
            sb.append("Anything\n");


        bw.write( String.valueOf(sb) );
        bw.flush();
        br.close();
        bw.close();

    }

}
