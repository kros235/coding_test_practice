package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_10156 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        StringTokenizer st = new StringTokenizer( br.readLine() );
        long unit_price      =   Long.parseLong(st.nextToken() );
        long amount          =   Long.parseLong(st.nextToken() );
        long pocket_money    =   Long.parseLong(st.nextToken() );

        long result =   (unit_price * amount) - pocket_money;
        if ( result < 0 )
            result  =   0;
        sb.append( result );
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
