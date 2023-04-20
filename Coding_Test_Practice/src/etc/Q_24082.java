package etc;

import java.io.*;

public class Q_24082 {



    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int amount         = Integer.parseInt( br.readLine() );

        sb.append( (int)Math.pow( amount, 3 ) );
        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
