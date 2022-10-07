package brute_force;

import java.io.*;
import java.util.Arrays;

public class Q_2798 {

    public static int get_max_approximate_num(int[] card_numbers, int target_number) {

        int max = -9999;

        for (int i = card_numbers.length - 1; i > 0; i--) {

            for (int j = i - 1; j >= 0; j--) {

                for (int k = j - 1; k >= 0; k--) {

                    int sum = card_numbers[i] + card_numbers[j] + card_numbers[k];
                    if (sum == target_number || sum < target_number)
                        if (max < sum)
                            max = sum;
                }
            }
        }
        return max;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int amount = Integer.parseInt(input[0]);
        int target_number = Integer.parseInt(input[1]);
        int[] card_numbers;

        if (amount < 3 || amount > 100
                || target_number < 10 || target_number > 300000) {
        } else {

            card_numbers = new int[amount];

            input = null;
            input = br.readLine().split(" ");

            for (int i = 0; i < input.length; i++)
                card_numbers[i] = Integer.parseInt(input[i]);

            Arrays.sort(card_numbers);

            int result = get_max_approximate_num(card_numbers, target_number);
            bw.write(String.valueOf(result) + "\n");

        }
        bw.flush();
        br.close();
        bw.close();
    }
}
