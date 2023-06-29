package etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_1475 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String room_no = br.readLine();

        int[] number_set = new int[10];
        Arrays.fill(number_set, 0);
        for (int i = 0; i < room_no.length(); i++) {
            int partial_room_no = Integer.parseInt(String.valueOf(room_no.charAt(i)));
            number_set[partial_room_no]++;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < number_set.length; i++) {
            if (i == 6 || i == 9) {
                if ((number_set[6] + number_set[9]) % 2 == 1) {
                    if (max < (number_set[6] + number_set[9]) / 2 + 1)
                        max = (number_set[6] + number_set[9]) / 2 + 1;
                } else {

                    if (max < (number_set[6] + number_set[9]) / 2)
                        max = (number_set[6] + number_set[9]) / 2;

                }
            } else {
                if (max < number_set[i])
                    max = number_set[i];
            }
        }


        sb.append(max);
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();

    }
}
