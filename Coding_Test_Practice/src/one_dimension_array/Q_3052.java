package one_dimension_array;
import java.io.*;
import java.util.Arrays;

public class Q_3052 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        int remainder, counter = 0;
        boolean valid_checker = true;

        int[] result = new int[42];
        Arrays.fill(result, 0);

        for (int i = 0; i < 10; i++) {
            input = br.readLine();
            if (Integer.parseInt(input) < 0 || Integer.parseInt(input) > 1000) {
                valid_checker = false;
                continue;
            }
            remainder = Integer.parseInt(input) % 42;
            result[remainder]++;
        }

        if (valid_checker != false) {
            for (int i = 0; i < 42; i++)
                if (result[i] > 0)
                    counter++;
            bw.write(String.valueOf(counter));
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
