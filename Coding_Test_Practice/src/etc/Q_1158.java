package etc;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q_1158 {

    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        Deque<Integer> deque = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int list = Integer.parseInt(st.nextToken());
        int hop = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= list; i++)
            deque.addLast( i );
        sb.append ("<");

        while ( !deque.isEmpty() ){

            if ( deque.size() != list )
                sb.append(", ");
            for ( int i = 0 ; i < hop ; i++ ){
                deque.addLast( deque.pollFirst() );
            }
            sb.append( deque.pollLast() );
        }

        sb.append(">");

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}
