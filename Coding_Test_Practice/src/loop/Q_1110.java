package loop;

import java.io.*;

public class Q_1110 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int origin_digit = Integer.parseInt(input);
        int cloned_digit = origin_digit;
        int round_counter = 1;

        if(origin_digit < 0 || origin_digit > 99){}
        else{

            for(;;) {

                int digit_A = cloned_digit / 10;
                int digit_B = cloned_digit % 10;

                int result = (digit_B * 10) + ( (digit_A + digit_B) % 10);

                if (result == origin_digit) break;
                else {
                    round_counter ++;
                    cloned_digit = result;
                }
            }
            bw.write(String.valueOf(round_counter));
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
