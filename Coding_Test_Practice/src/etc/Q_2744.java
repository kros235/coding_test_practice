package etc;

import java.io.*;
import java.math.BigInteger;

public class Q_2744 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb    =   new StringBuilder();
        String input        =   br.readLine();

        for ( int i = 0 ; i < input.length() ; i++ ){
            char partial    =   input.charAt(i);
            if ( partial >= 65 && partial <= 90)
                partial += 32;
            else
                partial -= 32;
            sb.append(partial);
        }

        bw.write( String.valueOf(sb) );

        bw.flush();
        br.close();
        bw.close();
    }

}
