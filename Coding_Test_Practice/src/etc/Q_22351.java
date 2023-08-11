package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.HashMap;

public class Q_22351 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();

        int chop_start_range = 1;
        boolean valid_check = false;
        for (int i = 1; i <= input.length(); i++) {
            valid_check = check_consequtive_num(Long.parseLong(input.substring(0, i)), i, input.substring(i, input.length()));
            if (valid_check == true) {
                chop_start_range = i;
                break;
            }
        }

        if (valid_check == false)
            sb.append(input + " " + input + "\n");
        else
            sb.append(input.substring(0, chop_start_range) + " " + get_end_value(chop_start_range, input) + "\n");

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

    private static String get_end_value(int chop_range, String input) {
        long start_num = Long.parseLong(input.substring(0, chop_range));

        if (chop_range == input.length())
            return input;
        else {
            int chop_range_new = chop_range;
            if (String.valueOf(start_num + 1).length() > chop_range)
                chop_range_new++;
            return get_end_value(chop_range_new, input.substring(chop_range, input.length()));
        }
    }


    private static boolean check_consequtive_num(long start_value, int chop_range, String input) {


        long start_num = 0;
        int chop_range_new = chop_range;

        if (input.length() == 0)
            return true;
        else {
            if (String.valueOf(start_value + 1).length() > chop_range)
                chop_range_new++;

            if (chop_range_new <= input.length()) {
                start_num = Long.parseLong(input.substring(0, chop_range_new));
                if ((start_value + 1) != start_num)
                    return false;

                return check_consequtive_num(start_num, chop_range_new, input.substring(chop_range_new, input.length()));
            } else
                return false;
        }

    }

}
