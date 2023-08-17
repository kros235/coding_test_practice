package stack_queue_and_deque;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_11866 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Queue<Integer> queue    =   new LinkedList<>();

        StringTokenizer st      =   new StringTokenizer( br.readLine() );

        int queue_size          =   Integer.parseInt( st.nextToken() );
        int kill_term           =   Integer.parseInt( st.nextToken() );
        sb.append("<");

        for ( int i = 1 ; i <= queue_size ; i++ )
            queue.offer ( i );

        while ( true ){
            if ( queue.isEmpty() == true )
                break;

            else {

                for ( int i = 0 ; i < kill_term-1 ; i++ ){
                    int temp    =   queue.poll();
                    queue.offer ( temp );
                }

                sb.append ( queue.poll());
                if ( queue.size() != 0)
                    sb.append (", ");
            }
        }

        sb.append(">");
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
