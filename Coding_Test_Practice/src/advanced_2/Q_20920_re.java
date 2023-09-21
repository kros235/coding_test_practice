package advanced_2;

import java.io.*;
import java.util.*;

public class Q_20920_re {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        HashMap<String, Integer> hashMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        long word_amount = Long.parseLong(st.nextToken());
        long word_length = Long.parseLong(st.nextToken());

        for (int i = 0; i < word_amount; i++) {
            String word = br.readLine();
            if (word.length() >= word_length) {
                if (hashMap.containsKey(word)) {
                    hashMap.put(word, hashMap.get(word) + 1);
                } else
                    hashMap.put(word, 1);
            } else
                continue;
        }


        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(hashMap.entrySet());
        Comparator<Map.Entry<String, Integer>> myComparator = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o1.getValue() != o2.getValue())
                    return o2.getValue() - o1.getValue();
                else {
                    if (o1.getKey().length() != o2.getKey().length())
                        return o2.getKey().length() - o1.getKey().length();

                    else
                        return o1.getKey().compareTo(o2.getKey());
                }
            }
        };


        entryList.sort(myComparator);
        for (Map.Entry<String, Integer> entry : entryList)
            sb.append(entry.getKey() + "\n");


        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

}
