package etc;

import java.io.*;
import java.util.ArrayList;

public class Q_2775 {
    public static int make_apt_table(int level, int room_no) {

        int[][] num = new int[level + 1][room_no];

        // make a room_no map
        for (int i = 0; i < num.length; i++) {

            for (int j = 0; j < num[i].length; j++) {

                if (i == 0)
                    num[i][j] = j + 1;

                else {
                    int sum = 0;

                    for (int k = 0; k <= j; k++)
                        sum += num[i - 1][k];

                    num[i][j] = sum;
                }
            }

        }
        return num[level][room_no - 1];
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String round = br.readLine();
        ArrayList<Integer> result = new ArrayList<>();


        for (int i = 0; i < Integer.parseInt(round); i++) {
            int level = Integer.parseInt(br.readLine());
            int room_no = Integer.parseInt(br.readLine());


            if (level < 1 || room_no < 1
                    || level > 14 || room_no > 14) {
            } else
                result.add(make_apt_table(level, room_no));
        }

        for (int i = 0; i < result.size(); i++)
            bw.write(result.get(i) + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
