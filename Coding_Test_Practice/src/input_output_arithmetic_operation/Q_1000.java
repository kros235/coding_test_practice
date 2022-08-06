package input_output_arithmetic_operation;

import java.util.Scanner;

public class Q_1000 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int a, b;

        a = input.nextInt();
        b = input.nextInt();

        if(a<0 || b>10) {}
        else
            System.out.println(a+b);
    }
}
