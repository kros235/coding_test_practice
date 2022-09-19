package basic_mathmatics_1;

import java.io.*;
import java.math.BigInteger;

public class Q_10757 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String[] parsed_iput = input.split(" ");

        BigInteger num1  = new BigInteger(parsed_iput[0]);
        BigInteger num2  = new BigInteger(parsed_iput[1]);

        String range = "1";
        for ( int i = 0 ; i< 10000 ; i ++)
            range += "0";


        if ( num1.compareTo(new BigInteger( String.valueOf(0) ) ) == -1
                || num2.compareTo(new BigInteger( String.valueOf(0) ) ) == -1
                || num1.compareTo(new BigInteger( range  ) ) == 1
                || num2.compareTo(new BigInteger( range  ) ) == 1) {}
        else {
            BigInteger result  = num1.add(num2);
            bw.write( String.valueOf(result) );
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
