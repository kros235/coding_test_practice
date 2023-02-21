package advanced_1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Q_1316 {

    public static StringBuilder remove_consequtive_word(StringBuilder input_word) {
        StringBuilder new_words = new StringBuilder(input_word.length());
        new_words.append(input_word);

        ArrayList<Integer> index_record = new ArrayList<>();

        for (int i = 0; i < input_word.length(); i++) {

            if ((i + 1) < input_word.length()) {

                if (String.valueOf(input_word.charAt(i)).equals(String.valueOf(input_word.charAt(i + 1))))
                    index_record.add((i + 1));
                else
                    continue;
            }
        }

        for (int i = 0; i < index_record.size(); i++)
            new_words.replace(index_record.get(i) - 1, index_record.get(i), "_");

        return new_words;
    }

    public static int check_group_word(StringBuilder input_word) {

        StringBuilder new_word = remove_consequtive_word(input_word);

        int[] alphabet_table = new int[26];
        Arrays.fill(alphabet_table, 0);


        for (int i = 0; i < new_word.length(); i++) {

            if (new_word.charAt(i) != '_') {
                int index = (int) new_word.charAt(i) - 97;

                if (alphabet_table[index] != 0) return 0;
                else
                    alphabet_table[index]++;
            }
        }
        return 1;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder input = new StringBuilder(br.readLine());
        int round = Integer.parseInt(input.toString());
        int count = 0;


        if (round < 0 || round > 100) {
        } else {

            ArrayList<String> words = new ArrayList<>();
            for (int i = 0; i < round; i++) {
                input = new StringBuilder(br.readLine());

                if (input.length() > 100) {
                } else
                    count += check_group_word(input);
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        br.close();
        bw.close();
    }

}
