package conditional_statements;

import java.util.Scanner;

public class Q_2884 {
    public static void main(String args[]) {

        int hour, minute, temp;
        Scanner input = new Scanner(System.in);

        hour = input.nextInt();
        minute = input.nextInt();

        if (hour < 0 || hour > 24
                || minute < 0 || minute > 59){
        }
        else {

            if( (minute - 45) < 0){
                temp = 45 - minute;

                if( (hour - 1) < 0)
                    hour = 23;
                else
                    hour -=1;

                minute = 60 - temp;

                System.out.println(hour + " " + minute);
            }
            else {
                minute -= 45;
                System.out.println(hour + " " + minute);
            }
        }
    }

}
