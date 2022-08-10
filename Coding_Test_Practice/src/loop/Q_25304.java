package loop;

import java.util.Scanner;

public class Q_25304 {
    public static void main(String args[]) {
        int total_sum, variety, calculated_sum = 0;
        int unit_price, quantity;

        Scanner input = new Scanner(System.in);
        total_sum = input.nextInt();
        variety = input.nextInt();

        if (total_sum < 1 || total_sum > 1000000000
                || variety < 1 || variety > 100){
        } else {
            for (int i = 0; i < variety; i++){
                unit_price = input.nextInt();
                quantity = input.nextInt();

                if(unit_price < 1 || unit_price > 1000000
                        || quantity < 1 || quantity > 10)
                    continue;
                else
                    calculated_sum += unit_price * quantity;

            }

            if(total_sum == calculated_sum)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
