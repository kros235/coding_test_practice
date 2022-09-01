package one_dimension_array;

import java.io.*;
import java.util.Arrays;

public class Q_1546 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String subject_amount = br.readLine();
        int max_score = -999;
        double score_sum = 0.0;
        double new_average;
        boolean valid_checker = true;

        if (Integer.parseInt(subject_amount) > 1000 || Integer.parseInt(subject_amount) < 0) {
        } else {

            String score_input = br.readLine();
            String[] score_text_array = score_input.split(" ");


            int zero_score_counter = 0;
            for (int i = 0; i < Integer.parseInt(subject_amount); i++) {
                if (Integer.parseInt(score_text_array[i]) == 0)
                    zero_score_counter++;
                if (Integer.parseInt(score_text_array[i]) > 100)
                    valid_checker = false;
                if (max_score < Integer.parseInt(score_text_array[i]))
                    max_score = Integer.parseInt(score_text_array[i]);
            }

            if (valid_checker != false && zero_score_counter != Integer.parseInt(subject_amount)) {

                for (int i = 0; i < Integer.parseInt(subject_amount); i++) {
                    score_sum += (Integer.parseInt(score_text_array[i]) / (double) max_score) * 100;
                }
                new_average = score_sum / Integer.parseInt(subject_amount);
                bw.write(String.valueOf(new_average));
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
