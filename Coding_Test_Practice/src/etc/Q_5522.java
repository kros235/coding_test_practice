package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q_5522 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;

        for ( int i = 0 ; i < 5 ; i ++)
            sum += Integer.parseInt( br.readLine() );

        bw.write(String.valueOf(sum));

        bw.flush();
        br.close();
        bw.close();
    }

}
