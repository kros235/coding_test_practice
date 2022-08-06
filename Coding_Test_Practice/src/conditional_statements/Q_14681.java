package conditional_statements;

import java.util.Scanner;

public class Q_14681 {
    public static void main(String args[]) {

        int x, y;
        Scanner input = new Scanner(System.in);

        x = input.nextInt();
        y = input.nextInt();

        if (x < -1000 || y > 4000
                || x > 1000 || y > 1000
                || x == 0   || y == 0){
        }
        else {
            if( (x > 0) && (y > 0) )
                System.out.println("1");
            else if( (x > 0) && (y < 0) )
                System.out.println("4");
            else if( (x < 0) && (y > 0) )
                System.out.println("2");
            else
                System.out.println("3");
        }
    }

}
