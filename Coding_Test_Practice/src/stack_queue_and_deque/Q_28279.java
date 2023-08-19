package stack_queue_and_deque;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_28279 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> deque = new LinkedList<>();

        int command_count = Integer.parseInt(br.readLine());

        for (int i = 0; i < command_count; i++) {
            String command = br.readLine();
            if (command.contains(" ")) {
                StringTokenizer st = new StringTokenizer(command);
                int location = Integer.parseInt(st.nextToken());
                int value = Integer.parseInt(st.nextToken());

                if (location == 1)
                    deque.addFirst(value);
                else
                    deque.addLast(value);
            } else {
                switch (Integer.parseInt(command)) {
                    case 3: {
                        if (!deque.isEmpty())
                            sb.append(deque.pop() + "\n");
                        else
                            sb.append("-1\n");
                        break;
                    }
                    case 4: {
                        if (!deque.isEmpty())
                            sb.append(deque.pollLast() + "\n");
                        else
                            sb.append("-1\n");
                        break;
                    }
                    case 5: {
                        sb.append(deque.size() + "\n");
                        break;
                    }
                    case 6: {
                        if (!deque.isEmpty())
                            sb.append("0\n");
                        else
                            sb.append("1\n");
                        break;
                    }
                    case 7: {
                        if (!deque.isEmpty())
                            sb.append(deque.peek() + "\n");
                        else
                            sb.append("-1\n");
                        break;
                    }
                    default: {
                        if (!deque.isEmpty())
                            sb.append(deque.peekLast() + "\n");
                        else
                            sb.append("-1\n");
                        break;
                    }
                }
            }
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
