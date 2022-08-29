package loop;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Q_10871 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int digit_count, compare_num;
        ArrayList<Integer> smaller_digits = new ArrayList<>();

        String input;
        input = br.readLine();

        String[] inserted_info, inserted_digits;
        inserted_info = input.split(" ");
        digit_count = Integer.parseInt(inserted_info[0]);
        compare_num = Integer.parseInt(inserted_info[1]);


        if (digit_count < 1 || digit_count > 10000
                || compare_num < 1 || compare_num > 10000) {
        } else {
            input = br.readLine();
            inserted_digits = input.split(" ");

            for (int i = 0; i < inserted_digits.length; i++) {
                if (Integer.parseInt(inserted_digits[i]) < compare_num)
                    smaller_digits.add(Integer.parseInt(inserted_digits[i]));
            }

            for (int i = 0; i < smaller_digits.size(); i++) {
                bw.write( String.valueOf( smaller_digits.get(i) ) );
                if (i != (smaller_digits.size() - 1)) bw.write(" ");
            }
            bw.flush();
            bw.close();
        }
    }
}
