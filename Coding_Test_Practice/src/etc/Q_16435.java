package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q_16435 {


    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );

        int fruit_amount    =   Integer.parseInt( st.nextToken() );
        int snake_length    =   Integer.parseInt( st.nextToken() );

        int[] fruit_position    =   new int[ fruit_amount ];

        st = new StringTokenizer( br.readLine() );
        for ( int i = 0 ; i < fruit_amount ; i++ )
            fruit_position[i] = Integer.parseInt( st.nextToken() );
        Arrays.sort( fruit_position );

        for ( int i = 0 ; i < fruit_position.length ; i++ ) {
            if ( fruit_position[i] <= snake_length )
                snake_length ++ ;
            else break;
        }

        sb.append( snake_length );
        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

}
