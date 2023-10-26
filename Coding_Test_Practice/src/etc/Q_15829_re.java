package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_15829_re {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int length   =   Integer.parseInt ( br.readLine() );
        String line  =   br.readLine();

        BigInteger hash_value =   new BigInteger("0");

        for ( int i = 0 ; i < length ; i++ ){
            hash_value = hash_value.add( BigInteger.valueOf( line.charAt(i) - 96 ).multiply( BigInteger.valueOf(31).pow(i) ) );
        }

        // hash_value.remainder(BigInteger.valueOf(1234567891));
        // sb.append ( hash_value );
        sb.append( hash_value.remainder(BigInteger.valueOf(1234567891)) );

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

}
