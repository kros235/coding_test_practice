package etc;

import java.io.*;
import java.math.BigInteger;

public class Q_26574 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int round    =   Integer.parseInt( br.readLine() );

        for ( int i = 0 ; i < round ; i ++ ){
            int digit    =   Integer.parseInt( br.readLine() );
            sb.append( digit + " " + digit + "\n");
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
