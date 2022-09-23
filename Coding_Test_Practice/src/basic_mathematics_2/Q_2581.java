package basic_mathematics_2;

import java.io.*;
import java.util.ArrayList;

public class Q_2581 {
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

        ArrayList<Integer> digits = new ArrayList<>();

        String input = br.readLine();
        int min_range = Integer.parseInt(input);

        input = br.readLine();
        int max_range = Integer.parseInt(input);

        if (min_range > max_range || min_range > 10000 || max_range > 10000) {
        } else {

            int total = 0;
            int min_prime = -1;
            for (int i = min_range; i <= max_range ; i++) {

                int result = check_prime_number(i);
                if (result == 1) {
                    digits.add(i);
                    total += i;
                    if(min_prime == -1)
                        min_prime = i;
                }
            }

            if( digits.size() == 0 )
                bw.write(String.valueOf(-1) );
            else
                bw.write(total + "\n" + min_prime);
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
