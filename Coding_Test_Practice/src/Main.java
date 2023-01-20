import java.io.*;
import java.math.BigInteger;


public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        BigInteger first     =   new BigInteger( br.readLine() );
        BigInteger second     =   new BigInteger( br.readLine() );

        sb.append ( first.add(second) + "\n");

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }
}


