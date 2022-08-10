package one_dimension_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q_10818 {
    public static void main(String args[]) {

        int amount, temp_num;
        int max = -1000001, min = 100001;
        ArrayList<Integer> digits = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        amount = input.nextInt();

        if (amount < 1 || amount > 1000000) {
        } else {


            for (int i = 0; i < amount; i++) {
                temp_num = input.nextInt();
                if (temp_num < -1000000 || temp_num > 1000000)
                    continue;
                else {
                    digits.add(temp_num);
                    if (temp_num > max) max = temp_num;
                    if (temp_num < min) min = temp_num;
                }
            }

        }
        System.out.println(min + " " + max);
    }
}
