package etc;

import java.io.*;

public class Q_24568 {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int big_box         =   Integer.parseInt( br.readLine() );
        int small_box       =   Integer.parseInt( br.readLine() );
        int total_donuts    =   (big_box * 8) + (small_box * 3);

        sb.append( (total_donuts - 28) + "\n");

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();

    }

}
