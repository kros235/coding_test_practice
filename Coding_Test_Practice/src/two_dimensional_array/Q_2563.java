package two_dimensional_array;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_2563 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int amount = Integer.parseInt(br.readLine());
        boolean paper[][]   =   new boolean[101][101];
        int area_counter    =   0;

        // initialization
        for (int i = 0; i < paper.length; i++)
            Arrays.fill(paper[i], false);


        if (amount >= 1 && amount <= 100) {

            StringTokenizer st;

            for (int i = 0; i < amount; i++) {

                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                // mark added papers area
                for (int j = x; j < x + 10; j++)
                    for (int k = y; k < y + 10; k++)
                        paper[j][k] = true;
            }

            for (int i = 1; i < paper.length; i++)
                for (int j = 1; j < paper[i].length; j++)
                    if ( paper[i][j] == true )
                        area_counter++;

            bw.write( String.valueOf( area_counter ));

            bw.flush();
            br.close();
            bw.close();
        }
    }
}
