package etc;

import java.io.*;
import java.util.*;

public class Q_2606 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int node_count  =   Integer.parseInt( br.readLine() );
        int link_count  =   Integer.parseInt( br.readLine() );
        boolean[] visit_checker =   new boolean[ node_count ];
        Arrays.fill( visit_checker, false);

        ArrayList<ArrayList<Integer>> link    =   new ArrayList<>();
        for ( int i = 0 ; i < node_count ; i++ )
            link.add( new ArrayList<>() );

        for ( int i = 0 ; i < link_count ; i++ ){
            StringTokenizer st  =   new StringTokenizer( br.readLine() );
            int start_point     =   Integer.parseInt( st.nextToken() );
            int end_point       =   Integer.parseInt( st.nextToken() );
            link.get( start_point-1 ).add( end_point );
            link.get( end_point-1 ).add( start_point );
        }



        //visit_checker   =   dfs ( 1, link, visit_checker );
        visit_checker   =   bfs ( 1, link, visit_checker );

        int affected_one    =   0;
        for ( int i = 0 ; i < visit_checker.length ; i++ )
            if ( visit_checker[i] == true )
                affected_one++;

        sb.append( affected_one-1 );
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

    private static boolean[] bfs(int start_node, ArrayList<ArrayList<Integer>> link, boolean[] visit_checker) {

        for ( int i = 0 ; i < link.size() ; i++ )
            Collections.sort ( link.get(i) );

        Queue<Integer> queue    =   new LinkedList<>();

        queue.add( start_node );


        while ( !queue.isEmpty() ){

            int current_node    =   queue.poll();
            visit_checker[ current_node - 1 ] =   true;

            for ( int i = 0 ; i < link.get( current_node - 1 ).size() ; i++ ) {
                int linked_node =   link.get( current_node - 1 ). get(i);
                if ( visit_checker[linked_node-1] == false )
                    queue.add(linked_node);
            }
        }

        return visit_checker;
    }

    private static boolean[] dfs(int start_node, ArrayList<ArrayList<Integer>> link, boolean[] visit_checker) {

        Stack<Integer> stack    =   new Stack<>();
        stack.push( start_node );
        visit_checker [ start_node-1 ] = true;


        while( !stack.isEmpty() ){
            start_node = stack.pop();
            //System.out.println( start_node + " -> ");
            for ( int i = 0 ; i < link.get(start_node-1).size() ; i++ ){
                if ( visit_checker [ link.get(start_node-1).get(i)-1 ] != true ) {
                    stack.push(link.get(start_node - 1).get(i));
                    visit_checker [ link.get(start_node-1).get(i)-1 ] = true;
                }
            }
        }
        return visit_checker;
    }
}
