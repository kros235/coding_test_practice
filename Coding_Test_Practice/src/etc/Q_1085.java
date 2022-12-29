package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_1085 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb    =   new StringBuilder();
        StringTokenizer st  =   new StringTokenizer( br.readLine() );

        int x               =   Integer.parseInt( st.nextToken() );
        int y               =   Integer.parseInt( st.nextToken() );
        int right_top_x     =   Integer.parseInt( st.nextToken() );
        int right_top_y     =   Integer.parseInt( st.nextToken() );


        int small_x, small_y;

        if ( ( x - 0 ) < ( right_top_x - x ) )
            small_x =   ( x - 0 );
        else
            small_x =   ( right_top_x - x );

        if ( ( y - 0 ) < ( right_top_y - y ) )
            small_y =   ( y - 0 );
        else
            small_y =   ( right_top_y - y );

        if ( small_x < small_y )
            sb.append ( small_x );
        else
            sb.append ( small_y );

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
