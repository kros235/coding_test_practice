package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q_2742 {

    public static void main(String args[]) throws IOException {

        BufferedReader br   = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw   = new BufferedWriter(new OutputStreamWriter(System.out));

        int max_number      =   Integer.parseInt( br.readLine() );
        StringBuilder sb    =   new StringBuilder();

        while(max_number > 0){
            sb.append(String.valueOf(max_number--) + "\n");
        }

        bw.write( String.valueOf(sb) );

        bw.flush();
        br.close();
        bw.close();
    }

}
