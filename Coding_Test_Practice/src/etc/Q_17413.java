package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Stack;

public class Q_17413 {


    public static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String input = br.readLine();
        Stack<String> stack = new Stack<>();

        boolean bracket_detector = false;
        for (int i = 0; i < input.length(); i++) {

            if (bracket_detector == false) {

                if (String.valueOf(input.charAt(i)).equals("<")) {
                    if (!stack.isEmpty())
                        flush_stack(stack);
                    bracket_detector = true;
                    sb.append(String.valueOf(input.charAt(i)));
                } else if (String.valueOf(input.charAt(i)).equals(" ")) {
                    if (!stack.isEmpty())
                        flush_stack(stack);
                    sb.append(String.valueOf(input.charAt(i)));
                } else {
                    stack.push(String.valueOf(input.charAt(i)));
                }
            } else {
                sb.append(String.valueOf(input.charAt(i)));
                if (String.valueOf(input.charAt(i)).equals(">"))
                    bracket_detector = false;
            }
        }

        if (!stack.isEmpty())
            flush_stack(stack);

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

    private static void flush_stack(Stack<String> stack) {
        while (!stack.isEmpty())
            sb.append(stack.pop());
    }

}
