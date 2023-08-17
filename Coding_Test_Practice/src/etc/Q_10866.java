package etc;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q_10866 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int round = Integer.parseInt( br.readLine() );
        Deque<Integer> deque   =   new LinkedList<>();


        for (int i = 0; i < round ; i++) {
            String input        =   br.readLine();
            String command;
            if ( input.contains(" ") == true ) {
                StringTokenizer st = new StringTokenizer(input);
                command = st.nextToken();
                int value   =   Integer.parseInt( st.nextToken() );

                switch ( command ){
                    case "push_front" : {
                        deque.addFirst( value );
                        break;
                    }
                    case "push_back" : {
                        deque.addLast( value );
                        break;
                    }
                    default:{
                        break;
                    }
                }
            }
            else{
                command =   input;

                switch ( command ){
                    case "pop_front" : {
                        if ( !deque.isEmpty())
                            sb.append( deque.pop() + "\n" );
                        else
                            sb.append( "-1\n" );
                        break;
                    }
                    case "pop_back" : {
                        if ( !deque.isEmpty())
                            sb.append( deque.pollLast() + "\n" );
                        else
                            sb.append( "-1\n" );
                        break;
                    }
                    case "size" : {
                        sb.append( deque.size() + "\n" );
                        break;
                    }
                    case "empty" : {
                        if ( !deque.isEmpty())
                            sb.append( "0\n" );
                        else
                            sb.append( "1\n" );
                        break;
                    }
                    case "front" : {
                        if ( !deque.isEmpty())
                            sb.append( deque.peekFirst() + "\n" );
                        else
                            sb.append( "-1\n" );
                        break;
                    }
                    case "back" : {
                        if ( !deque.isEmpty())
                            sb.append( deque.peekLast() + "\n");
                        else
                            sb.append( "-1\n");
                        break;
                    }
                    default:{
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
