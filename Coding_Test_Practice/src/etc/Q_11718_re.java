package etc;

import java.io.*;
import java.math.BigInteger;

public class Q_11718_re {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        String input;

        while( (input=br.readLine())!= null && input.length() > 0){
            sb.append( input + "\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
