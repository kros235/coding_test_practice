package etc;

import java.io.*;

public class Q_9316 {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int round    =   Integer.parseInt( br.readLine() );


        for ( int i = 1 ; i <= round ; i++ )
            sb.append( "Hello World, Judge " + i + "!\n");
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
