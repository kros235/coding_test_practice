package divisor_multiple_and_prime_numbers_2;

import java.io.*;
import java.util.StringTokenizer;

public class Q_13241 {

    public static long find_min(long a, long b) {
        if (a > b)
            return b;
        else
            return a;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long multiplier = 1;

        while (true) {
            boolean dividable = false;


            for (long i = 2; i <= find_min(a, b); i++) {
                if ((a % i == 0) && (b % i == 0)) {
                    dividable = true;
                    multiplier *= i;
                    a /= i;
                    b /= i;
                }
            }
            if (dividable == false) {
                multiplier *= a;
                multiplier *= b;
                break;
            }
        }
        sb.append(multiplier);
        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();

    }

}
