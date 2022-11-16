package etc;

import java.io.*;

public class Q_14581 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String name = br.readLine();

        StringBuilder sb = new StringBuilder();
        sb.append( ":fan::fan::fan:\n" +
                ":fan::"+ name + "::fan:\n" +
                ":fan::fan::fan:" );
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();

    }

}
