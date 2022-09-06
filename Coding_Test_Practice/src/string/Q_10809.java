package string;

import java.io.*;
import java.util.Arrays;

public class Q_10809 {

    public static int[] get_alphabet_encounter_counts(String input) {

        int[] alphabet_result = new int[26];
        Arrays.fill(alphabet_result, -1);

        for (int i = 0; i < alphabet_result.length; i++) {
            char compare_alphabet = (char)('a' + i);

            for (int j = 0; j < input.length(); j++) {
                if( compare_alphabet == input.charAt(j)) {
                    alphabet_result[i] = j;
                    break;
                }
            }
        }
        return alphabet_result;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int[] alphabet_result = new int[26];

        if (input.length()  > 100) {
        } else {
            alphabet_result = get_alphabet_encounter_counts(input);

            for (int i = 0; i < alphabet_result.length; i++)
                bw.write(alphabet_result[i] + " ");
            bw.flush();
        }
        br.close();
        bw.close();
    }

}
