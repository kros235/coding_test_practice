package one_dimensional_array;

import java.io.*;
import java.util.ArrayList;

public class Q_4344 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Double> above_average_student_rate = new ArrayList<>();

        boolean valid_score_checker;
        String amount_of_course = br.readLine();
        int student_in_course, point_sum, good_student_count;
        double course_average;

        for (int i = 0; i < Integer.parseInt(amount_of_course); i++) {
            valid_score_checker = true;
            String course_info_input = br.readLine();
            String[] course_info = course_info_input.split(" ");

            student_in_course = Integer.parseInt(course_info[0]);

            if (student_in_course < 0 || student_in_course > 1000) {
            } else {

                point_sum = 0;
                for (int j = 1; j <= student_in_course; j++) {
                    if (Integer.parseInt(course_info[j]) < 0 || Integer.parseInt(course_info[j]) > 100)
                        valid_score_checker = false;
                    else point_sum += Integer.parseInt(course_info[j]);
                }
                if (valid_score_checker != false) {
                    course_average = point_sum / (double) Integer.parseInt(course_info[0]);

                    good_student_count = 0;
                    for (int j = 1; j <= student_in_course; j++) {
                        if (Integer.parseInt(course_info[j]) > course_average) good_student_count++;
                    }

                    above_average_student_rate.add(good_student_count / (double) Integer.parseInt(course_info[0]) * 100);
                }
            }
        }

        for (int i = 0; i < above_average_student_rate.size(); i++) {
            bw.write(String.valueOf(String.format("%.3f%%\n", above_average_student_rate.get(i))));
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
