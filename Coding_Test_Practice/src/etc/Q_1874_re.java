package etc;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q_1874_re {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int round = Integer.parseInt(br.readLine());

        int list[] = new int[round];
        for (int i = 0; i < round; i++)
            list[i] =   Integer.parseInt( br.readLine() );

        Stack<Integer> stack    =   new Stack<>();
        int start_indicator     =   1;
        for (int i = 1; i <= round; i++){
            while( list[i-1] >= start_indicator ){
                stack.push ( start_indicator++ );
                sb.append("+\n");
            }
            if ( stack.peek()  == list[i-1]   ){
                stack.pop();
                sb.append("-\n");
            }
            else{
                sb.replace( 0 , sb.length(), "");
                sb.append("NO\n");
                break;
            }
        }

        bw.write( String.valueOf(sb) );
        bw.flush();
        br.close();
        bw.close();
    }

}
