package recursive;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q_24060 {

    static int target_counter = 0;
    static int target_round;
    static int result_value;


    public static int[] merge_sort(int[] list, int start, int end) {

        int[] temp_list = new int[end - start + 1];

        // 다수의 원소가 있는 경우, temp_list 로의 복사
        if (start != end) {
            int counter = 0;
            for (int i = start; i <= end; i++) {
                temp_list[counter++] = list[i];
            }
        }

        // 단일 원소일 경우, temp_list 로의 복사
        else {
            temp_list[0] = list[end];
        }

        // ===============================================
        // 원소의 개수가 2개라 직접 비교가 가능한 경우
        if ((end - start) == 1) {

            int temp;

            if (temp_list[0] > temp_list[1]) {
                temp = temp_list[0];
                temp_list[0] = temp_list[1];
                temp_list[1] = temp;
            }

            target_counter++;
            if (target_round == target_counter)
                result_value = temp_list[0];

            target_counter++;
            if (target_round == target_counter)
                result_value = temp_list[1];

            return temp_list;
        }

        // 원소의 개수가 1개라 비교가 필요 없는 경우
        else if ((end - start) == 0) {
            return temp_list;
        }

        // 다수의 원소가 있어서, 재귀적으로 리스트를 구획화하여 나눠 처리해야하는 경우
        else {

            int mid = (end - start) / 2;

            int[] tmp_list1 = merge_sort(list, start, start + mid);
            int[] tmp_list2 = merge_sort(list, start + mid + 1, end);


            // 구획화해서 정리한 리스트를 다시 병합하는 과정에서 정렬하는 부분
            int result[] = new int[tmp_list1.length + tmp_list2.length];

            int tmp1_counter = 0;
            int tmp2_counter = 0;
            int result_counter = 0;

            for (; ; ) {

                // 원소의 대소 비교
                if (tmp_list1[tmp1_counter] < tmp_list2[tmp2_counter]) {
                    result[result_counter++] = tmp_list1[tmp1_counter++];
                    target_counter++;
                    if (target_round == target_counter)
                        result_value = tmp_list1[tmp1_counter - 1];
                } else {
                    result[result_counter++] = tmp_list2[tmp2_counter++];
                    target_counter++;
                    if (target_round == target_counter)
                        result_value = tmp_list2[tmp2_counter - 1];
                }


                // 끝까지 두 리스트를 비교해서, 결과에 정렬이 끝난 경우
                if (result_counter == result.length)
                    break;


                // 한 쪽 리스트에 원소를 전부 소진해서, 원소가 남은 리스트의 원소를 다 남은 결과에 기재해야하는 경우
                if (tmp_list1.length == tmp1_counter || tmp_list2.length == tmp2_counter) {

                    if (tmp_list1.length == tmp1_counter) {
                        for (int i = result_counter; i < result.length; i++) {
                            result[i] = tmp_list2[tmp2_counter++];
                            target_counter++;
                            if (target_round == target_counter)
                                result_value = tmp_list2[tmp2_counter - 1];
                        }
                    } else {
                        for (int i = result_counter; i < result.length; i++) {
                            result[i] = tmp_list1[tmp1_counter++];
                            target_counter++;
                            if (target_round == target_counter)
                                result_value = tmp_list1[tmp1_counter - 1];
                        }
                    }
                    break;
                }

            }


            return result;
        }

    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int list_size = Integer.parseInt(st.nextToken());
        target_round = Integer.parseInt(st.nextToken());


        if (list_size >= 5 && list_size <= 500000
                && target_round >= 1 && target_round <= Math.pow(10, 8)) {

            int[] list = new int[list_size];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < list_size; i++)
                list[i] = Integer.parseInt(st.nextToken());

            int[] result = merge_sort(list, 0, list.length - 1);

            StringBuilder sb = new StringBuilder();
            if (target_round > target_counter)
                sb.append(String.valueOf(-1) + "\n");
            else
                sb.append(String.valueOf(result_value) + "\n");
            bw.write(String.valueOf(sb));

        }

        bw.flush();
        br.close();
        bw.close();
    }

}
