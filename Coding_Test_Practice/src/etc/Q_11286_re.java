package etc;

import java.io.*;
import java.util.PriorityQueue;

public class Q_11286_re {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int round = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if ( first_abs == second_abs ){
                return o1 > o2 ? 1 : -1;
            }
            return first_abs - second_abs;
        });


        for (int i = 0; i < round; i++) {
            int action = Integer.parseInt(br.readLine());
            if (action != 0)
                myQueue.add ( action );
            else {
                if ( myQueue.isEmpty() == true )
                    sb.append("0\n");
                else
                    sb.append(myQueue.poll() + "\n");
            }
        }


        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
