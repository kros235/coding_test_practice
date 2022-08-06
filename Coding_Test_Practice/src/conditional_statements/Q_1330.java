package conditional_statements;

import java.util.Scanner;

public class Q_1330 {
    public static void main(String args[]) {

        int num1, num2;
        Scanner input = new Scanner(System.in);

        num1 = input.nextInt();
        num2 = input.nextInt();

        if(num1< -10000 || num2 < -10000
                || num1 > 10000 || num2 > 10000) {}
        else{
            if(num1 < num2)
                System.out.println("<");
            else if(num1 > num2)
                System.out.println(">");
            else
                System.out.println("==");
        }
    }

}
