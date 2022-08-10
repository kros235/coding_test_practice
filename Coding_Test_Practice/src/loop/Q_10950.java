package loop;

import java.util.ArrayList;
import java.util.Scanner;

public class Q_10950 {
    public static void main(String args[]) {
        int amount_of_values;
        int cal_value1, cal_value2;
        ArrayList<Integer> integers2 = new ArrayList<>(); // 타입 생략 가능

        Scanner input = new Scanner(System.in);
        amount_of_values = input.nextInt();

        for (int i = 0; i < amount_of_values; i++) {
            cal_value1 = input.nextInt();
            cal_value2 = input.nextInt();

            if (cal_value1 < 0 || cal_value2 > 10)
                continue;
            else
                integers2.add((cal_value1 + cal_value2));
        }

        if (integers2.size() > 0)
            for (int i = 0; i < amount_of_values; i++)
                System.out.println(integers2.get(i));
    }
}
