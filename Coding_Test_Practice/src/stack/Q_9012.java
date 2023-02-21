package stack;

import java.io.*;

public class Q_9012 {

    public static String judge_String(String input) {

        int open_counter = 0;
        for (int i = 0; i < input.length(); i++) {

            if (String.valueOf(input.charAt(i)).equals("("))
                open_counter++;
            else open_counter--;

            if (open_counter < 0)
                return "NO\n";
        }

        if (open_counter != 0)
            return "NO\n";
        else
            return "YES\n";

    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int string_amount = Integer.parseInt(br.readLine());

        for (int i = 0; i < string_amount; i++) {
            String input = br.readLine();
            sb.append(judge_String(input));
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }
}
