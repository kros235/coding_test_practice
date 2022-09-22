package basic_mathematics_2;

import java.io.*;
import java.math.BigInteger;

public class Q_1978 {
    public static int check_prime_number(int number) {

        int count = 0;
        for (int i = 1; i <= number; i++)
            if (number % i == 0)
                count++;

        if (count == 2)
            return 1;
        else
            return 0;

    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String numbers_amount_string = br.readLine();
        int numbers_amount = Integer.parseInt(numbers_amount_string);

        if (numbers_amount > 100) {
        } else {

            String[] numbers = br.readLine().split(" ");

            boolean range_check = true;
            for (int i = 0; i < numbers.length; i++) {
                if (Integer.parseInt(numbers[i]) > 1000)
                    range_check = false;
            }

            if (range_check != false) {
                int prime_number_count = 0;

                for (int i = 0; i < numbers.length; i++)
                    prime_number_count += check_prime_number(Integer.parseInt(numbers[i]));

                bw.write(prime_number_count + "\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
