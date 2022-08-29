package loop;

import java.io.*;
import java.util.ArrayList;

public class Q_10952 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> result = new ArrayList<>();

        for ( ; ; ) {

            String input = br.readLine();
            String[] calculation_values = input.split(" ");

            int a = Integer.parseInt(calculation_values[0]);
            int b = Integer.parseInt(calculation_values[1]);

            if (a < 0 || a > 10 || b < 0 || b > 10) {
            } else {
                if (a == 0 && b == 0) break;
                else result.add((a + b));
            }
        }

        for (int i = 0; i < result.size(); i++) {
            bw.write(String.valueOf(result.get(i)));
            if (i != (result.size() - 1)) bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
