package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q_2440 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int round   =   Integer.parseInt( br.readLine() );

        for ( int i = round ; i > 0 ; i-- ) {
            for ( int j = i ; j > 0 ; j-- ) {
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

}
