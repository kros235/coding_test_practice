package greedy_algorithm;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_11399 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int amount_of_ppl = Integer.parseInt(br.readLine());

        int[] time_cosumption = new int[amount_of_ppl];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < amount_of_ppl; i++)
            time_cosumption[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(time_cosumption);

        int sum = 0;
        for (int i = 0; i < amount_of_ppl; i++) {

            if (i != 0) {
                for (int j = 0; j <= i; j++)
                    sum += time_cosumption[j];
            } else
                sum += time_cosumption[i];
        }


        bw.write(sum + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
