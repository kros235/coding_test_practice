package two_dimensional_array;

import java.io.*;
import java.util.StringTokenizer;

public class Q_2566 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int list[][] = new int[10][10];
        int max = -99999;
        String max_location = "0 0";
        StringTokenizer st;

        for (int i = 1; i <= 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 9; j++) {
                list[i][j] = Integer.parseInt(st.nextToken());
                if (list[i][j] > max) {
                    max = list[i][j];
                    max_location = i + " " + j;
                }
            }
        }
        bw.write(String.valueOf(max) + "\n" + max_location);

        bw.flush();
        br.close();
        bw.close();
    }
}
