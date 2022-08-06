package conditional_statements;

import java.util.Scanner;

public class Q_2480 {

    public static int find_max_value(int[] dice) {

        int max_value = -999;

        for (int i = 0; i < dice.length; i++) {
            if (dice[i] > max_value) max_value = dice[i];
        }
        return max_value;
    }

    public static int[] count_duplicates(int[] dice_results) {

        int[] count_result = {-1, 0};


        for (int i = 0; i < dice_results.length; i++) {
            if(count_result[1] == (dice_results.length-1)) break;
            for (int j = i + 1; j < dice_results.length; j++) {
                if (dice_results[i] == dice_results[j]) {
                    count_result[0] = dice_results[i];
                    count_result[1]++;
                }
            }
        }
        return count_result;
    }


    public static void main(String args[]) {


        int[] dice_result = new int[3];
        int[] count_result;
        int max_value, prize;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            dice_result[i] = input.nextInt();
        }

        max_value = find_max_value(dice_result);
        count_result = count_duplicates(dice_result);

        switch (count_result[1]) {
            case 2: {
                prize = 10000 + (max_value * 1000);
                break;
            }
            case 1: {
                prize = 1000 + (count_result[0] * 100);
                break;
            }
            default: {
                prize = max_value * 100;
                break;
            }
        }
        System.out.println(prize);
    }
}
