package loop;

import java.util.Scanner;

public class Q_2739 {
    public static void main(String args[]) {
        int multiplication_value;

        Scanner input = new Scanner(System.in);
        multiplication_value = input.nextInt();

        if (multiplication_value < 1 || multiplication_value > 9) {
        } else {
            for (int i = 1; i <= 9; i++)
                System.out.println(multiplication_value + " * " + i + " = " + (multiplication_value * i));
        }
    }
}
