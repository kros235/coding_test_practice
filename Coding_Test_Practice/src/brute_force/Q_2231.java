package brute_force;

import java.io.*;
import java.util.Arrays;

public class Q_2231 {

    public static int get_each_digit_sum(int digit) {

        int sum = 0;

        sum += digit / 1000000;
        digit %= 1000000;

        sum += digit / 100000;
        digit %= 100000;

        sum += digit / 10000;
        digit %= 10000;

        sum += digit / 1000;
        digit %= 1000;

        sum += digit / 100;
        digit %= 100;

        sum += digit / 10;
        digit %= 10;

        sum += digit / 1;

        return sum;
    }

    public static int get_partial_sum(int digit) {

        int min = 1000001;

        for (int i = digit; i > 0; i--) {
            if ((i + get_each_digit_sum(i)) == digit && min > i)
                min = i;
        }

        if (min == 1000001)
            return 0;
        else
            return min;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int digit = Integer.parseInt(br.readLine());
        int result = 0;

        if (digit < 1 || digit > 1000000) {
        } else {


            result = get_partial_sum(digit);

            bw.write(String.valueOf(result) + "\n");

        }
        bw.flush();
        br.close();
        bw.close();

    }
}
