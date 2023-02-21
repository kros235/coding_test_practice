package stack;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q_10828 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        int command_amount = Integer.parseInt(br.readLine());
        String command;
        int value = -1;

        for (int i = 0; i < command_amount; i++) {
            String input = br.readLine();

            if (input.contains(" ") == true) {
                StringTokenizer st = new StringTokenizer(input);
                command = st.nextToken();
                value = Integer.parseInt(st.nextToken());
            } else {
                command = input;
            }

            switch (command) {
                case "push": {
                    stack.push(value);
                    break;
                }
                case "pop": {
                    if (stack.isEmpty() == true)
                        sb.append("-1\n");
                    else
                        sb.append(stack.pop() + "\n");
                    break;
                }
                case "size": {
                    sb.append(stack.size() + "\n");
                    break;
                }
                case "empty": {
                    if (stack.isEmpty() == true)
                        sb.append("1\n");
                    else
                        sb.append("0\n");
                    break;
                }
                default: { //"top"
                    if (stack.isEmpty() == true)
                        sb.append("-1\n");
                    else
                        sb.append(stack.peek() + "\n");
                    break;
                }
            }
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
