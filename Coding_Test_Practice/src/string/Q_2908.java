package string;

import java.io.*;

public class Q_2908 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String[] input_digits = input.split(" ");

        int a = Integer.parseInt(input_digits[0]);
        int b = Integer.parseInt(input_digits[1]);

        if (a == 0 || b == 0 || a == b
                || a < 1 || b < 1 || a > 999 || b > 999) {
        } else {

            StringBuffer sb = new StringBuffer(input);
            String reversed_input = sb.reverse().toString();

            input_digits = reversed_input.split(" ");
            a = Integer.parseInt(input_digits[0]);
            b = Integer.parseInt(input_digits[1]);

            if (a > b)
                bw.write(String.valueOf(a));
            else
                bw.write(String.valueOf(b));

            bw.flush();
        }
        br.close();
        bw.close();
    }

}
