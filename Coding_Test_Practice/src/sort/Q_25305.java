package sort;

import java.io.*;
import java.util.Arrays;

public class Q_25305 {

    public static int[] sort_list(int[] inputs) {

        Arrays.sort(inputs);

        return inputs;

    }


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String[] input = br.readLine().split(" ");

        int student_amount = Integer.parseInt(input[0]);
        int prize_cut_line = Integer.parseInt(input[1]);


        if (student_amount < 1 || student_amount > 1000
                || prize_cut_line < 1 || prize_cut_line > student_amount) {
        } else {
            int[] inputs = new int[student_amount];

            String[] scores = br.readLine().split(" ");

            for (int i = 0; i < scores.length; i++) {
                int temp = Integer.parseInt(scores[i]);
                if (temp < 1 || temp > 10000) {
                } else
                    inputs[i] = temp;
            }

            inputs = sort_list(inputs);

            bw.write(inputs[inputs.length - prize_cut_line] + "\n");

        }
        bw.flush();
        br.close();
        bw.close();
    }
}
