package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_27959 {



    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );

        int amount  =   Integer.parseInt( st.nextToken() );
        int price   =   Integer.parseInt( st.nextToken() );

        if ( (100 * amount) >= price )
            sb.append ( "Yes\n" );
        else
            sb.append ( "No\n" );
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
