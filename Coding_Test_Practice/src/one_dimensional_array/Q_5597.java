package one_dimensional_array;

import java.io.*;
import java.util.StringTokenizer;

public class Q_5597 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int amount = Integer.parseInt(br.readLine());
        int target_number, counter = 0;
        int list[];

        if (amount >= 1 && amount <= 100) {

            list = new int[amount];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < list.length; i++)
                list[i] = Integer.parseInt(st.nextToken());

            target_number = Integer.parseInt(br.readLine());

            if (target_number >= -100 && target_number <= 100) {

                for (int i = 0; i < list.length; i++)
                    if (list[i] == target_number) counter++;
            }

            bw.write(String.valueOf(counter));
        }

        bw.flush();
        br.close();
        bw.close();

    }
}
