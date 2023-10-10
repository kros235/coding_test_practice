package etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_1253 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int data_size = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] data_basket = new long[data_size];
        for (int i = 0; i < data_size; i++)
            data_basket[i] = Long.parseLong(st.nextToken());
        Arrays.sort(data_basket);

        int total_good_numbers = 0;
        for (int i = 0; i < data_size; i++) {
            boolean good_number_checker = good_number_check(data_basket[i], i, data_basket);

            if (good_number_checker == true)
                total_good_numbers++;
            else
                continue;
        }
        sb.append(total_good_numbers + "\n");
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

    private static boolean good_number_check(long target_num, int target_num_index, long[] data_basket) {


        int start_index = 0;
        int end_index = data_basket.length-1;

        if ( start_index == target_num_index )
            start_index++;
        if ( end_index == target_num_index )
            end_index--;

        boolean binary_search_result = false;
        while (true) {
            if (end_index <= start_index) {
                binary_search_result = false;
                break;
            } else {
                if (data_basket[start_index] + data_basket[end_index] == target_num) {
                    binary_search_result = true;
                    break;
                } else if (data_basket[start_index] + data_basket[end_index] > target_num) {
                    end_index--;
                    if ( end_index == target_num_index )
                        end_index--;
                }
                else {
                    start_index++;
                    if ( start_index == target_num_index )
                        start_index++;
                }
            }
        }

        if (binary_search_result == true)
            return true;
        else
            return false;

    }

}
