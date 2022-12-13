package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q_7891 {

    public static void main(String args[]) throws IOException {

        BufferedReader br   = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw   = new BufferedWriter(new OutputStreamWriter(System.out));


        StringBuilder sb    =   new StringBuilder();

        int round           =   Integer.parseInt( br.readLine() );
        for ( int i = 0 ; i < round ; i++){
            StringTokenizer st  =   new StringTokenizer( br.readLine() );

            BigInteger a   =   new BigInteger( st.nextToken() );
            BigInteger b   =   new BigInteger( st.nextToken() );
            sb.append ( a.add( b ) + "\n");
        }

        bw.write( String.valueOf(sb) );

        bw.flush();
        br.close();
        bw.close();

    }

}
