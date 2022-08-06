package input_output_arithmetic_operation;

import java.util.Scanner;

public class Q_10869 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        num1 = input.nextInt();
        num2 = input.nextInt();

        if(num1<1 || num2>10001) {}
        else {
            System.out.println(num1 + num2);
            System.out.println(num1 - num2);
            System.out.println(num1 * num2);
            System.out.println(num1 / num2);
            System.out.println(num1 % num2);
        }
    }
}
