package etc;

import java.io.*;

public class Q_23234 {



    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        sb.append( "The world says hello!" );
        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

}
