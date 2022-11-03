package etc;

import java.io.*;

public class Q_5339 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        sb.append("     /~\\\n" +
                "    ( oo|\n" +
                "    _\\=/_\n" +
                "   /  _  \\\n" +
                "  //|/.\\|\\\\\n" +
                " ||  \\ /  ||\n" +
                "============\n" +
                "|          |\n" +
                "|          |\n" +
                "|          |");
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
