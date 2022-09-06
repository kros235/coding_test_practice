package functions;

import java.io.*;
import java.util.Arrays;

public class Q_1065 {
    public static int get_han_number_counts(int max_number) {

        int count = 0;
        int diff_between_thousand_and_hundred;
        int diff_between_hundred_and_ten;
        int diff_between_ten_and_one;

        for (int i = 1; i <= max_number; i++) {
            if (i < 100) count++;
            else {
                diff_between_thousand_and_hundred = ((i / 1000) % 10) - ((i / 100) % 10);
                diff_between_hundred_and_ten = ((i / 100) % 10) - ((i / 10) % 10);
                diff_between_ten_and_one = ((i / 10) % 10) - (i % 10);

                if (i > 100 && i < 1000 && diff_between_hundred_and_ten == diff_between_ten_and_one)
                    count++;

                else {
                    if (diff_between_thousand_and_hundred == diff_between_hundred_and_ten && diff_between_hundred_and_ten == diff_between_ten_and_one)
                        count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int max_number = Integer.parseInt(input);

        if (max_number < 0 || max_number > 1000) {
        } else {
            int count = get_han_number_counts(max_number);

            bw.write(count + "\n");
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
