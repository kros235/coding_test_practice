package loop;

import java.util.Scanner;

public class Q_8393 {
    public static void main(String args[]) {
        int last_value, sum = 0;

        Scanner input = new Scanner(System.in);
        last_value = input.nextInt();

        if (last_value < 1 || last_value > 10000) {
        } else {
            for (int i = 1; i <= last_value; i++)
                sum += i;

            System.out.println(sum);
        }
    }
}
