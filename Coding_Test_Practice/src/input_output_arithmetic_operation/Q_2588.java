package input_output_arithmetic_operation;

import java.util.Scanner;

public class Q_2588 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String num1, num2;

        int temp;

        num1 = input.next();
        num2 = input.next();

        for (int i = num2.length() - 1; i >= 0; i--) {
            temp = num2.charAt(i) - '0';
            System.out.println((Integer.parseInt(num1) * temp));
        }

        System.out.println((Integer.parseInt(num1) * (Integer.parseInt(num2))));
    }
}
