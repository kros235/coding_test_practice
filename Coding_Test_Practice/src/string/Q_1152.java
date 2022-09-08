package string;

import java.io.*;
import java.util.Arrays;

public class Q_1152 {

    public static String[] tokenize_words(String input_line) {

        String[] words = input_line.split(" ");
        return words;
    }

    public static int count_words(String[] words) {

        int count = 0;
        for (int i = 0; i < words.length; i++)
            if (!words[i].equals("")) count++;

        return count;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        if (input.length() > 1000000) {
        } else {
            String[] words = tokenize_words(input);
            int word_counts = count_words(words);

            bw.write(String.valueOf(word_counts));
            bw.flush();
        }
        br.close();
        bw.close();
    }

}
