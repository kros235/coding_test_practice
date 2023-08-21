package stack_queue_and_deque;

import java.io.*;
import java.util.*;

public class Q_2346_re {

    public static class Balloon {
        int index; // 풍선 번호
        int value; // 적혀있는 값

        public Balloon(int index, int value) {
            this.index=index;
            this.value=value;
        }
    }
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int data_size = Integer.parseInt(br.readLine());
        Deque<Balloon> deque = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < data_size; i++)
            deque.add( new Balloon( (i + 1), Integer.parseInt(st.nextToken() ) ) ) ;




        while (deque.size() != 0) {

            sb.append(deque.peekFirst().index + " ");
            int move_amount = deque.pollFirst().value;

            // 남아있는 풍선이 없다면 종료
            if(deque.isEmpty())
                break;

            if (move_amount > 0) {

                for (int i = 0; i < Math.abs(move_amount) - 1; i++)
                    deque.addLast(deque.pollFirst());


            } else {


                for (int i = 0; i < Math.abs(move_amount) ; i++)
                    deque.addFirst(deque.pollLast());


            }
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
