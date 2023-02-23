package divisor_multiple_and_prime_numbers;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_5086 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int array_size = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] a = new int[array_size];
        int[] b = new int[array_size];

        // ============================================================
        // input
        // ============================================================
        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < array_size; j++) {
                if (i % 2 == 0)
                    a[j] = Integer.parseInt(st.nextToken());
                else
                    b[j] = Integer.parseInt(st.nextToken());
            }
        }

        // ============================================================
        // sort
        // ============================================================
        Arrays.sort ( a );
        Arrays.sort ( b );

        // ============================================================
        // logic function
        // ============================================================

        long sum    =   0;
        for (int i = 0; i < array_size; i++)
            sum += a[i] * b[array_size - i - 1];

        sb.append(sum + "\n");
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
