package etc;

import java.io.*;

public class Q_24086 {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int height_A         =   Integer.parseInt(br.readLine());
        int height_B         =   Integer.parseInt(br.readLine());

        sb.append ( (height_B - height_A ));
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
