package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;

public class Q_2338 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger first    =   new BigInteger( br.readLine() );
        BigInteger second   =   new BigInteger( br.readLine() );

        bw.write( String.valueOf( first.add( second ) ) + "\n");
        bw.write( String.valueOf( first.subtract( second ) ) + "\n" );
        bw.write( String.valueOf( first.multiply( second ) ) + "\n" );

        bw.flush();
        br.close();
        bw.close();
    }

}
