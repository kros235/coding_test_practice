package etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_2609 {

    public static int final_a, final_b;

    public static int get_max_divider(int a, int b) {

        int min;
        int max_divider = 1;
        if (a < b)
            min = a;
        else
            min = b;

        boolean dividable_checker = false;
        for (int i = 2; i <= min; i++) {

            if ((a % i == 0) && (b % i == 0)) {
                dividable_checker = true;
                max_divider *= get_max_divider(a / i, b / i) * i;
                break;
            }

        }

        if (dividable_checker == false) {
            final_a = a;
            final_b = b;
            return 1;
        }

        return max_divider;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        // =========================
        // input
        // =========================
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // =========================
        // logic
        // =========================

        int max_divider = get_max_divider(a, b);
        int min_common_num = max_divider * final_a * final_b;

        // =========================
        // print
        // =========================

        sb.append(max_divider + "\n");
        sb.append(min_common_num + "\n");

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }
}

