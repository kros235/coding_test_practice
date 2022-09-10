import java.io.*;

public class Main {
    static StringBuilder input;

    public static int find_croatian_word_count(String compare_string) {

        System.out.println("compare_String = " + compare_string);
        // 일단 감지되니까 들어옴
        int count = 0;

        while(input.indexOf(compare_string) == -1) {


            System.out.println("input.indexOf(compare_string) = " + input.indexOf(compare_string));
            System.out.println("compare_string.length() = " + compare_string.length());
            System.out.println("input = " + input + ", input.length = " + input.length());
            input.replace(input.indexOf(compare_string), compare_string.length(), "_");

            count++;
            System.out.println("compare_String = " + compare_string + ", input_string = " + input + ", count = " + count + ", input.length = " + input.length());
        }

        return count;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        input = new StringBuilder(br.readLine());


        String[] alphabet_table = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};

        int total_Croatian_alphabet_count = 0;


        if (input.length() < 0 || input.length() > 100) {
        } else {

            for (int i = 0; i < alphabet_table.length; i++) {
                total_Croatian_alphabet_count += find_croatian_word_count(alphabet_table[i]);
            }

            for (int i = 0; i < input.length(); i++) {
                if (!String.valueOf(input.charAt(i)).equals("_"))
                    total_Croatian_alphabet_count++;
            }


            bw.write(String.valueOf(total_Croatian_alphabet_count));
            bw.flush();
        }
        br.close();
        bw.close();
    }
}