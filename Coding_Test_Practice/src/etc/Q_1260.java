package etc;

import java.io.*;
import java.util.*;

public class Q_1260 {

    public static Queue<Integer> queue    =   new LinkedList<>();
    public static ArrayList<ArrayList<Integer>> adjNode   =   new ArrayList<>();
    public static boolean[] visit;
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb  = new StringBuilder();



        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int node_count      =   Integer.parseInt( st.nextToken() );
        int line_count      =   Integer.parseInt( st.nextToken() );
        int start_node      =   Integer.parseInt( st.nextToken() );

        visit               =   new boolean[ node_count + 1 ];
        for( int i = 0 ; i <= node_count ; i++ )
            adjNode.add(new ArrayList<>());


        for ( int i = 0 ; i < line_count ; i++ ){
            st              =   new StringTokenizer( br.readLine() );
            int start       =   Integer.parseInt( st.nextToken() );
            int end         =   Integer.parseInt( st.nextToken() );

            adjNode.get(start).add(end);
            adjNode.get(end).add(start);
        }

        for ( int i = 1 ; i <= node_count ; i++ )
            Collections.sort ( adjNode.get(i) );

        sb.append( dfs( start_node ) + "\n" );

        visit   =   new boolean[ node_count + 1 ];
        sb.append( bfs( start_node ) + "\n" );

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

    private static String dfs( int start_node ) {
        String result       =   start_node + " ";
        visit[ start_node ] =   true;

        for ( int i = 0 ; i < adjNode.get( start_node ).size() ; i++ ){
            int next_node    =  adjNode.get( start_node ).get( i );
            if ( visit[ next_node ] == false )
                result  +=  dfs ( next_node );
        }
        return result;
    }

    public static String bfs( int start_node ) {
        String result   =   "";

        queue.add( start_node );
        visit[ start_node ] = true;

        while ( !queue.isEmpty() ){
            int node_index  =   queue.poll();
            result += node_index + " ";

            for ( int i = 0 ; i < adjNode.get( node_index ).size() ; i++ ){
                int node    =   adjNode.get(node_index).get(i);
                if ( visit [ node ] == false ) {
                    queue.add(node);
                    visit [ node ]    =   true;
                }
            }
        }

        return result;
    }
}
