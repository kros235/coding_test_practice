package etc;

import java.io.*;

public class Q_1712 {
    public static long find_profit_point(long fixed_budget, long manufacturing_budget, long sales_price) {
        long investments, differ, decrease_amount;
        if (manufacturing_budget >= sales_price)
            return -1;
        else if( ( fixed_budget + manufacturing_budget ) < sales_price)
            return 1;
        else {
            investments = fixed_budget + manufacturing_budget;
            differ = investments - sales_price;
            decrease_amount = sales_price - manufacturing_budget;

            return 1 + (differ / decrease_amount) + 1;
        }
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String[] input_digits = input.split(" ");

        long fixed_budget = Long.parseLong(input_digits[0]);
        long manufacturing_budget = Long.parseLong(input_digits[1]);
        long sales_price = Long.parseLong(input_digits[2]);


        if (fixed_budget < 0 || manufacturing_budget < 0 || sales_price < 0
                || fixed_budget > 2100000000 || manufacturing_budget > 2100000000 || sales_price > 2100000000) {
        } else {

            long result_count = find_profit_point(fixed_budget, manufacturing_budget, sales_price);
            bw.write(String.valueOf(result_count));
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
