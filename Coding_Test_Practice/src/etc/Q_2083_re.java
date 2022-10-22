package etc;

import java.io.*;
import java.util.ArrayList;

public class Q_2083_re {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (true) {
                String str = sc.next();
                int age = sc.nextInt();
                int weight = sc.nextInt();

                if (str.equals("#") && age == 0 && weight ==0) {
                    break;
                }

                if (age > 17 || weight >= 80) {
                    System.out.println(str +" "+"Senior");
                } else  {
                    System.out.println(str +" "+"Junior");
                }
            }
        }
    }
}
