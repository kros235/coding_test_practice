package functions;

import java.io.*;
import java.util.Arrays;

public class Q_15596 {
    public static long sum(int[] a) {
        long ans = 0L;

        for (int i = 0; i < a.length; i++)
            ans += a[i];

        return ans;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean valid_checker = true;
        long sum_result = 0L;

        String input = br.readLine();
        int n = Integer.parseInt(input);

        if (n < 1 || n > 3000000) {
        } else {

            input = br.readLine();
            String[] init_a = input.split(" ");

            int[] a = new int[n];
            Arrays.fill(a, 0);

            for (int i = 0; i < n; i++) {
                if (Integer.parseInt(init_a[i]) < 0 || Integer.parseInt(init_a[i]) > 1000000)
                    valid_checker = false;
                else
                    a[i] = Integer.parseInt(init_a[i]);
            }

            if(valid_checker != false)
                sum_result = sum(a);
        }

        bw.write( String.valueOf(sum_result) );

        bw.flush();
        br.close();
        bw.close();
    }
}
