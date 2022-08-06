package input_output_arithmetic_operation;

import java.util.Scanner;

public class Q_18108 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int year;
        year = input.nextInt();

        if (year < 1000 || year > 3000) {
        } else
            System.out.println((year - 543));
    }
}
