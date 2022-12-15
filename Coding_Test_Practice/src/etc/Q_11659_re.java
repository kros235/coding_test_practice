package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_11659_re {

    public static long add_range(int[] digits, int start_index, int end_index) {
        long result = digits[end_index] - digits[start_index-1];
        return result;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int digit_count = Integer.parseInt(st.nextToken());
        int rounds = Integer.parseInt(st.nextToken());
        int[] digits = new int[digit_count + 1];

        // insert
        st = new StringTokenizer(br.readLine());
        digits[0]   =   0;
        int sum = 0;
        for (int i = 1; i <= digit_count; i++) {
            sum += Integer.parseInt(st.nextToken());
            digits[i] = sum;
        }

        // process
        for (int i = 0; i < rounds; i++) {
            st = new StringTokenizer(br.readLine());
            int start_index = Integer.parseInt(st.nextToken());
            int end_index = Integer.parseInt(st.nextToken());

            long result = add_range(digits, start_index, end_index);
            sb.append(String.valueOf(result) + "\n");
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();

    }

}
