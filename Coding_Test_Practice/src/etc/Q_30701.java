package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q_30701 {


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st      =   new StringTokenizer( br.readLine() );
        long room_count         =   Long.parseLong( st.nextToken() );
        long ability            =   Long.parseLong( st.nextToken() );

        //ArrayList<Long> enemies =   new ArrayList<>() ;
        //ArrayList<Long> items   =   new ArrayList<>() ;

        PriorityQueue<Long> enemies = new PriorityQueue<>();
        PriorityQueue<Long> items = new PriorityQueue<>();

        for ( int i = 0 ; i < room_count ; i++ ){
            st                  =   new StringTokenizer( br.readLine() );
            int category        =   Integer.parseInt( st.nextToken() );
            long power          =   Long.parseLong( st.nextToken() );

            if ( category == 1 )
                enemies.add ( power );
            else
                items.add( power );
        }

        //Collections.sort ( enemies );
        //Collections.sort ( items );

        long count_pass         =   0;
        while ( true ){

            if ( items.isEmpty() && enemies.isEmpty() )    //  올 클리어
                break;
            else{   //  먹을 수 있는 아이템이 있거나, 전진이 가능하다
                if ( !enemies.isEmpty() && enemies.peek() < ability ){
                    ability += enemies.peek();
                    //enemies.remove(0);
                    enemies.poll();
                }
                else if ( items.isEmpty() )
                    break;
                else {
                    ability *= items.peek();
                    //items.remove(0);
                    items.poll();
                }
                count_pass ++;
            }

        }

        sb.append(count_pass + "\n");
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
