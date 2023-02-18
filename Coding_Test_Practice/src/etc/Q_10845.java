package etc;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_10845 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Queue<Integer> queue    =   new LinkedList<>();
        int command_amount = Integer.parseInt(br.readLine());
        String input, command;
        int value   =   0, last     =   -1;

        for ( int i = 0 ; i < command_amount ; i++ ){

            input        =   br.readLine();
            if ( input.contains(" ") == true) {
                StringTokenizer st = new StringTokenizer( input );

                command = st.nextToken();
                value = Integer.parseInt(st.nextToken());
            }
            else
                command =   input;

            // =================================
            // logic
            // =================================
            switch ( command ){
                case "push":{
                    queue.add (value);
                    last    =   value;
                    break;
                }
                case "pop":{
                    if ( queue.size() != 0 )
                        sb.append( queue.poll() + "\n");
                    else
                        sb.append( "-1\n");
                    break;
                }
                case "size":{
                    sb.append( queue.size() + "\n");
                    break;
                }
                case "empty":{
                    if ( queue.isEmpty() == false )
                        sb.append( "0\n");
                    else
                        sb.append( "1\n");
                    break;
                }
                case "front":{
                    if ( queue.size() != 0 )
                        sb.append( queue.peek() + "\n");
                    else
                        sb.append( "-1\n");
                    break;
                }
                default:{   //  back
                    if ( queue.isEmpty() == true)
                        sb.append("-1\n");
                    else
                        sb.append(last + "\n");
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
