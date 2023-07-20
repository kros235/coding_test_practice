package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_11943 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int basket_1_apple  =   Integer.parseInt( st.nextToken() );
        int basket_1_orange =   Integer.parseInt( st.nextToken() );

        st  =   new StringTokenizer( br.readLine() );
        int basket_2_apple  =   Integer.parseInt( st.nextToken() );
        int basket_2_orange =   Integer.parseInt( st.nextToken() );

        int method_1        =   basket_1_apple + basket_2_orange;
        int method_2        =   basket_1_orange + basket_2_apple;

        if ( method_1 < method_2 )
            sb.append ( method_1 );
        else
            sb.append ( method_2 );

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
