package etc;

import java.io.*;
import java.util.*;

public class Q_11724_re {

    public static int chunk_count = 0;
    public static ArrayList<ArrayList<Integer>> links   =   new ArrayList<>();
    public static boolean[] visit_checker;
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int node_count  =   Integer.parseInt( st.nextToken() );
        int link_count  =   Integer.parseInt( st.nextToken() );

        visit_checker   =   new boolean[node_count+1];
        visit_checker[0]=   true;

        for ( int i = 0 ; i < node_count+1 ; i++ )
            links.add ( new ArrayList<>() );

        for ( int i = 0 ; i < link_count ; i++ ){
            st  =   new StringTokenizer( br.readLine() );
            int start_node  =   Integer.parseInt( st.nextToken() );
            int end_node    =   Integer.parseInt( st.nextToken() );
            links.get( start_node ).add( end_node );
            links.get( end_node ).add( start_node );
        }

        for ( int i = 1 ; i < links.size() ; i++ ){
            if ( visit_checker[i] == false ){
                chunk_count++;
                //dfs( i );
                bfs ( i );
            }
            else continue;
        }

        sb.append( chunk_count );
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

    private static void bfs(int start_node) {
        Queue< Integer > queue  =   new LinkedList<>();
        queue.offer ( start_node );

        while ( !queue.isEmpty() ){
            int node    =   queue.poll();
            visit_checker[ node ]   =   true;
            for ( int i = 0 ; i < links.get(node).size() ; i++ ){
                int result  =   links.get(node).get(i);
                if ( visit_checker [ result ] == false ) {
                    queue.offer(result);
                    visit_checker[result] = true;
                }
                else continue;
            }
        }
    }

    private static void dfs(int start_node) {
        visit_checker[ start_node ] = true;
        for ( int i = 0 ; i < links.get( start_node ).size() ; i++ ){
            if ( visit_checker[ links.get(start_node).get(i) ] == false )
                dfs ( links.get(start_node).get(i) );
            else
                continue;
        }
    }


}
