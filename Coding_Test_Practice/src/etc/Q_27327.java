package etc;

import java.io.*;

public class Q_27327 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int day   =   Integer.parseInt( br.readLine() );

        bw.append( (day * 24 ) + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

}
