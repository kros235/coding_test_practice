package conditional_statements;

import java.util.Scanner;

public class Q_2525 {

    public static void main(String args[]) {


        int hour, minute, duration_time, division, remainder;
        Scanner input = new Scanner(System.in);

        hour = input.nextInt();
        minute = input.nextInt();
        duration_time = input.nextInt();

        if (hour < 0 || hour > 24
                || minute < 0 || minute > 59
                || duration_time <0 || duration_time > 1000){
        }
        else {

            if( (minute + duration_time) >= 60){

                division = (minute + duration_time) / 60;
                remainder = (minute + duration_time) % 60;

                if( (hour + division) > 23)
                    hour = (hour + division) % 24;
                else
                    hour +=division;

                minute = remainder;
                System.out.println(hour + " " + minute);
            }
            else {
                minute += duration_time;
                System.out.println(hour + " " + minute);
            }
        }
    }
}
