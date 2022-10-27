package etc;

import java.io.*;

public class Q_2558 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A   =   Integer.parseInt( br.readLine() );
        int B   =   Integer.parseInt( br.readLine() );

        if ( A > 0 && B > 0 && A < 10 && B < 10)
            bw.write( String.valueOf( A + B ) );

        bw.flush();
        br.close();
        bw.close();

    }

}
