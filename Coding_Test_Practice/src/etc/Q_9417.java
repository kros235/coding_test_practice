package etc;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q_9417 {

    public static int get_gcd(int a, int b) {
        int result = 1;
        int min;
        if (a < b)
            min = a;
        else
            min = b;

        while (true) {
            boolean dividable = false;
            for (int i = 2; i <= min; i++) {
                if ((a % i == 0) && (b % i == 0)) {
                    result *= i;
                    a /= i;
                    b /= i;
                    dividable = true;
                }
            }
            if (dividable == false)
                break;
        }
        return result;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int round = Integer.parseInt(br.readLine());


        for (int i = 0; i < round; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int amount = st.countTokens();
            int[] digits = new int[amount];
            for (int j = 0; j < amount; j++) {
                digits[j] = Integer.parseInt(st.nextToken());
            }

            int max = -1;
            for (int j = 0; j < amount; j++) {
                for (int k = j+1; k < amount; k++) {
                    int result = get_gcd(digits[j], digits[k]);
                    if (max < result)
                        max = result;
                }
            }
            sb.append(max + "\n");
        }


        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
