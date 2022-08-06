package conditional_statements;

import java.util.Scanner;

public class Q_9498 {
    public static void main(String args[]) {

        int score;
        Scanner input = new Scanner(System.in);
        score = input.nextInt();

        if (score < 0 || score > 100) {
        } else {
            int temp = score / 10;

            switch (temp) {
                case 10:
                case 9: {
                    System.out.println("A");
                    break;
                }
                case 8: {
                    System.out.println("B");
                    break;
                }
                case 7: {
                    System.out.println("C");
                    break;
                }
                case 6: {
                    System.out.println("D");
                    break;
                }
                default: {
                    System.out.println("F");
                    break;
                }
            }
        }
    }

}
