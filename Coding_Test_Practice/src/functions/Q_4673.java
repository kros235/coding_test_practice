package functions;

import java.io.*;
import java.util.Arrays;

public class Q_4673 {
    static final int MAX_BOUNDARY = 10000;

    public static int[] get_self_numbers(int[] record_table) {

        int new_number;

        for (int i = 1; i <= record_table.length - 1; i++) {
            new_number = i;
            while (true) {
                if (record_table[i] == -1 || new_number >= MAX_BOUNDARY) break;
                else {
                    new_number = new_number + ((new_number / 1000) % 10) + ((new_number / 100) % 10) + ((new_number / 10) % 10) + (new_number % 10);

                    if (new_number <= MAX_BOUNDARY) record_table[new_number] = -1;
                }
            }
        }
        return record_table;
    }

    public static void main(String args[]) throws IOException {


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] record_table = new int[MAX_BOUNDARY + 1];
        Arrays.fill(record_table, 0);

        record_table = get_self_numbers(record_table);

        for (int i = 1; i <= record_table.length - 1; i++) {
            if (record_table[i] != -1) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
