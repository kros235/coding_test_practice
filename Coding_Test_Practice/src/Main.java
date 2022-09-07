import java.io.*;
import java.util.Arrays;

public class Main {

    public static String convert_into_non_captial_line(String input_line) {

        String new_line = "";

        for (int i = 0; i < input_line.length(); i++) {
            char partial = input_line.charAt(i);

            if ((int) partial >= 65 && (int) partial <= 90)
                new_line += (char) (partial + 32);
            else
                new_line += partial;
        }
        return new_line;
    }

    public static int[] count_duplicated_letter(String input_line) {

        String new_line = "";
        int[] alphabet_dashboard = new int[26];

        Arrays.fill(alphabet_dashboard, -1);

        for (int i = 0; i < input_line.length(); i++) {

            char partial = input_line.charAt(i);
            int index = (int) partial;

            if (alphabet_dashboard[(index - 97)] != -1) continue;
            else {
                int count = 0;
                for (int j = i; j < input_line.length(); j++)
                    if (partial == input_line.charAt(j)) count++;
                alphabet_dashboard[(index - 97)] = count;
            }
        }
        return alphabet_dashboard;
    }

    public static String find_max_duplicates(int[] alphabet_dashboard) {

        int max = -999;
        int max_index = -1;
        boolean max_duplicate_encounters = false;

        for (int i = 0; i < alphabet_dashboard.length; i++) {
            if (max < alphabet_dashboard[i]) {
                max = alphabet_dashboard[i];
                max_index = i;
            }
        }

        for (int i = 0; i < alphabet_dashboard.length; i++) {
            if (i != max_index && max == alphabet_dashboard[i])
                max_duplicate_encounters = true;
        }

        if (max_duplicate_encounters != true)
            return "" + (char) (max_index + 65);
        return "?";
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();


        if (input.length() > 1000000) {
        } else {

            String minimalized_line = convert_into_non_captial_line(input);
            int[] alphabet_dashboard = count_duplicated_letter(minimalized_line);
            String result = find_max_duplicates(alphabet_dashboard);

            bw.write(result);
            bw.flush();
        }
        br.close();
        bw.close();
    }
}

/*
 A 		Z
65		90

	32

  a		z
97		122
 */