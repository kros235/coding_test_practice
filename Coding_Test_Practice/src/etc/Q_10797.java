package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q_10797 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int rule        =   Integer.parseInt( br.readLine() );
        int violation   =   0;

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        for ( int i = 0 ; i < 5 ; i ++ ){
            if ( Integer.parseInt( st.nextToken() ) == rule )
                violation++;
        }
        sb.append( violation );
        bw.write( String.valueOf(sb) );
        bw.flush();
        br.close();
        bw.close();
    }

}
