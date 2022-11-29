package etc;

import java.io.*;

public class Q_8545 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        String input     = br.readLine();

        for (int i = input.length()-1 ; i >= 0 ; i -- ){
            sb.append( input.charAt(i) );
        }
        sb.append( "\n" );

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();

    }

}
