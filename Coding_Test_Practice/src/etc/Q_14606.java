package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q_14606 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int height   =   Integer.parseInt( br.readLine() );

        if ( height <= 1 )
            sb.append("0\n");
        else{
            int happiness   =   0;
            for ( int i = height-1 ; i >= 1 ; i-- )
                happiness += i;
            sb.append( happiness + "\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
