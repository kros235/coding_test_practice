package etc;

import java.io.*;

public class Q_5337 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        sb.append(".  .   .\n" +
                "|  | _ | _. _ ._ _  _\n" +
                "|/\\|(/.|(_.(_)[ | )(/.");
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();

    }

}
