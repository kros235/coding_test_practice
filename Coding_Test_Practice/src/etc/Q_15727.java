package etc;

import java.io.*;

public class Q_15727 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input           =   Integer.parseInt( br.readLine() );

        StringBuilder sb = new StringBuilder();
        for (int i = 1 ; ; i ++) {
            if( (i*5) >= input) {
                sb.append(i + "\n");
                break;
            }
            else continue;
        }
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();

    }

}
