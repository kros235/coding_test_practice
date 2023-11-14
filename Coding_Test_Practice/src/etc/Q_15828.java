package etc;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_15828 {

    public static void main(String args[]) throws IOException {
        BufferedReader br   =   new BufferedReader ( new InputStreamReader( System.in ) );
        BufferedWriter bw   =   new BufferedWriter ( new OutputStreamWriter( System.out ) );
        StringBuilder sb    =   new StringBuilder();

        long buffer_size     =   Long.parseLong ( br.readLine() );
        Queue<Integer> router = new LinkedList<>();
        while ( true ){
            int input       =   Integer.parseInt ( br.readLine() );
            if ( input == -1 )
                break;
            else{
                if ( input == 0 )
                    router.poll();
                else {
                    if ( router.size() != buffer_size )
                        router.add(input);
                }
            }
        }

        if ( router.size() > 0 )
            while ( !router.isEmpty() )
                sb.append ( router.poll() + " " );
        else
            sb.append ( "empty" );

        bw.write ( sb.toString() );
        br.close();
        bw.close();
    }

}
