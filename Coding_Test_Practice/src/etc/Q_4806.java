package etc;

import java.io.*;

public class Q_4806 {



    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int line_counter   =   0;

        while( br.readLine() != null )
            line_counter++;
        sb.append ( line_counter );

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
