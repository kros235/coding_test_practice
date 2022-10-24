package two_dimensional_array;

import java.io.*;
import java.util.StringTokenizer;

public class Q_2738 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int list_1[][], list_2[][];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        if (row >= 1 && col >= 1
                && row <= 100 && col <= 100) {

            list_1 = new int[row][col];
            list_2 = new int[row][col];


            for (int i = 0; i < list_1.length * 2; i++) {

                st = new StringTokenizer(br.readLine());

                if (i < row)
                    for (int j = 0; j < list_1[i].length; j++)
                        list_1[i][j] = Integer.parseInt(st.nextToken());

                else
                    for (int j = 0; j < list_1[i - row].length; j++)
                        list_2[i - row][j] = Integer.parseInt(st.nextToken());

            }


            for (int i = 0; i < list_1.length; i++) {
                for (int j = 0; j < list_1[i].length; j++)
                    bw.write(String.valueOf(list_1[i][j] + list_2[i][j]) + " ");

                bw.write("\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
