package etc;

import java.io.*;
import java.util.ArrayList;

public class Q_2556 {



    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int rounds = Integer.parseInt(br.readLine());

        for (int i = 0; i < rounds; i++) {
            for (int j = 0; j < rounds; j++)
                sb.append("*");
            sb.append("\n");
        }


        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
