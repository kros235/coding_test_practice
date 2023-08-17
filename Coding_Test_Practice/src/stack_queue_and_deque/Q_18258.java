package stack_queue_and_deque;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_18258 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Queue<Integer> queue    =   new LinkedList<>();
        int command_rounds  =   Integer.parseInt( br.readLine() );
        String command;
        int value   =   -1, last = -1;

        for ( int i = 0 ; i < command_rounds ; i++ ){
            String input    =   br.readLine();
            if (input.contains(" ") == true ){

                StringTokenizer st  =   new StringTokenizer( input );
                command             =   st.nextToken();
                value               =   Integer.parseInt( st.nextToken() );
                last                =   value;
            }
            else
                command             =   input;


            switch( command ){
                case "push":{
                    queue.offer ( value );
                    break;
                }
                case "pop":{
                    if ( queue.isEmpty() == true )
                        sb.append("-1\n");
                    else
                        sb.append( queue.poll() + "\n");
                    break;
                }
                case "size":{
                    sb.append( queue.size() + "\n");
                    break;
                }
                case "empty":{
                    if ( queue.isEmpty() == true)
                        sb.append("1\n");
                    else
                        sb.append("0\n");
                    break;
                }
                case "front":{
                    if ( queue.isEmpty() == true)
                        sb.append("-1\n");
                    else
                        sb.append( queue.peek() + "\n");
                    break;
                }
                default:{   // back
                    if ( queue.isEmpty() == true)
                        sb.append("-1\n");
                    else
                        sb.append( value + "\n");
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
