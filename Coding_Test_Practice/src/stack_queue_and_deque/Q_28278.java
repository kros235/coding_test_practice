package stack_queue_and_deque;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q_28278 {


    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack    =   new Stack<>();
        int round = Integer.parseInt( br.readLine() );

        for ( int i = 0 ; i < round ; i++ ){
            String command  =   br.readLine();
            if ( command.contains(" ") ){
                StringTokenizer st  =   new StringTokenizer( command );
                int cmd             =   Integer.parseInt( st.nextToken() );
                int value           =   Integer.parseInt( st.nextToken() );
                stack.push( value );
            }
            else{
                switch ( Integer.parseInt( command ) ){
                    case 2:{
                        if ( !stack.isEmpty() )
                            sb.append ( stack.pop() + "\n" );
                        else
                            sb.append ( "-1\n" );
                        break;
                    }
                    case 3:{
                        sb.append ( stack.size() + "\n" );
                        break;
                    }
                    case 4:{
                        if ( stack.isEmpty() )
                            sb.append ( "1\n" );
                        else
                            sb.append ( "0\n" );
                        break;
                    }
                    default:{
                        if ( !stack.isEmpty() )
                            sb.append ( stack.peek() + "\n" );
                        else
                            sb.append ( "-1\n" );
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
