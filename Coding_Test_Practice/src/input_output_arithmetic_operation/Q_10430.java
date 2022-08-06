package input_output_arithmetic_operation;

import java.util.Scanner;

public class Q_10430 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;

        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        if (num1 < 2 || num2 < 2 || num3 < 2
                || num1 > 10000 || num2 > 10000 || num3 > 10000) { }
        else {
            System.out.println( ((num1+num2)%num3) );
            System.out.println( ((num1%num3) + (num2%num3))%num3 );
            System.out.println(  (num1*num2)%num3 );
            System.out.println( ((num1%num3) * (num2%num3))%num3 );
        }
    }
}
