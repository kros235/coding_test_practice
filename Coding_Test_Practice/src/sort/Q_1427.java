package sort;

import java.io.*;
import java.util.Arrays;

public class Q_1427 {

    public static String get_reversed_sorted_string(String[] digits) {

        String result = "";

        Arrays.sort(digits);

        for (int i = digits.length-1 ; i >= 0 ; i-- )
            result += digits[i];

        return result;
    }


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String numbers = br.readLine();
        String[] digits = new String[numbers.length()];
        //1,000,000,000
        if (numbers.length() < 10 || (numbers.length() == 10 && String.valueOf(numbers.charAt(0)).equals("1"))) {
            for (int i = 0; i < numbers.length(); i++)
                digits[i] = String.valueOf(numbers.charAt(i));
        }

        bw.write( get_reversed_sorted_string ( digits ) + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
