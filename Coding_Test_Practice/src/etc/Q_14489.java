package etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_14489 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        long balance_A       =   Long.parseLong( st.nextToken() );
        long balance_B       =   Long.parseLong( st.nextToken() );
        long chicken_price   =   Long.parseLong( br.readLine() );

        if ( ( balance_A + balance_B ) >= ( chicken_price * 2 ) )
            sb.append ( ( balance_A + balance_B ) - ( chicken_price * 2) );
        else
            sb.append ( ( balance_A + balance_B ) );

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
