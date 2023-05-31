package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q_8760 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int test_round  =   Integer.parseInt( br.readLine() );

        for ( int i = 0 ; i < test_round ; i++ ){
            StringTokenizer st  =   new StringTokenizer( br.readLine() );
            int row             =   Integer.parseInt( st.nextToken() );
            int col             =   Integer.parseInt( st.nextToken() );

            sb.append ( ( (row * col) / 2 ) + "\n");
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
