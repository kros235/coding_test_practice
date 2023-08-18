package stack_queue_and_deque;

import java.io.*;
import java.util.*;

public class Q_12789 {

    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack    =   new Stack<>();
        int ppl_count = Integer.parseInt( br.readLine() );

        ArrayList<Integer> ppl  =   new ArrayList<>();
        StringTokenizer st      =   new StringTokenizer( br.readLine() );

        for ( int i = 0 ; i < ppl_count ; i++ )
            ppl.add ( Integer.parseInt( st.nextToken() ) );

        int index   =   1;
        boolean ordered_distribution    =   false;
        while ( true ){
            if ( stack.size() == 0 && ppl.size() == 0 ){
                ordered_distribution = true;
                break;
            }
            else if ( ppl.size() == 0
                    && !stack.isEmpty() && stack.peek() != index ){
                ordered_distribution = false;
                break;
            }
            else {
                if ( ppl.size()!= 0 &&  ppl.get(0) == index) {
                    index++;
                    ppl.remove(0);
                    continue;
                } else if (!stack.isEmpty() && stack.peek() == index) {
                    index++;
                    stack.pop();
                    continue;
                } else {
                    stack.push( ppl.get(0) );
                    ppl.remove( 0 );
                }
            }
        }

        if ( ordered_distribution == true )
            sb.append ("Nice\n");
        else
            sb.append ("Sad\n");

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
