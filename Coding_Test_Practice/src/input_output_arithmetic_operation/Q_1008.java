package input_output_arithmetic_operation;

import java.util.Scanner;

public class Q_1008 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double a, b;

        a = input.nextDouble();
        b = input.nextDouble();

        if(a<0 || b>10) {}
        else
            System.out.println(a/b);
    }
}
