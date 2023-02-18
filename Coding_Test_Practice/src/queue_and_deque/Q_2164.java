package queue_and_deque;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_2164 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Queue<Integer> queue    =   new LinkedList<>();
        int card_amount         =   Integer.parseInt( br.readLine() );

        for ( int i = 1 ; i <= card_amount ; i++)
            queue.offer ( i );

        while ( true ){

            if ( queue.size() == 1 )
                break;
            else{

                queue.poll();
                int temp    =   queue.peek();
                queue.poll();
                queue.offer ( temp );
            }
        }

        sb.append( queue.poll() + "\n");
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
