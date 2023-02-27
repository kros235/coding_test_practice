package etc;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Q_2822 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        LinkedHashMap<Integer, Integer> score   =   new LinkedHashMap<>();
        int[] score_array                       =   new int[8];
        int sum                                 =   0;

        for (int i = 0; i < 8 ; i++) {
            int score_num   =   Integer.parseInt(br.readLine());
            score.put(i+1, score_num);
            score_array[i]    =   score_num;
        }

        Arrays.sort( score_array );

        int counter     =   0;
        int[] result    =   new int[5];

        for ( int i = 7 ; i >= 3 ; i-- ) {
            result[counter++] = getKey(score, score_array[i]);
            sum += score_array[i];
        }

        Arrays.sort( result );

        sb.append( sum + "\n");
        for ( int i = 0 ; i < 5 ; i++ )
            sb.append( result[i] + " ");

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }


    // hashmap에 value 로 key 찾기
    public static <K, V> K getKey(Map<K, V> map, V value) {

        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }
}
