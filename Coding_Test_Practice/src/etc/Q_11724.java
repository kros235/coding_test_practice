package etc;

import java.io.*;
import java.util.*;

public class Q_11724 {

    public static int chunk_count = 0;
    static StringBuilder sb = new StringBuilder();
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int node_count  =   Integer.parseInt( st.nextToken() );
        int link_count  =   Integer.parseInt( st.nextToken() );


        boolean[] visit_checker =   new boolean[ node_count ];
        Arrays.fill ( visit_checker, false);
        ArrayList<ArrayList<Integer>> link = new ArrayList<ArrayList<Integer>>();
        for ( int i = 0 ; i < node_count ; i++ )
            link.add( new ArrayList<>() );

        for ( int i = 0 ; i < link_count ; i++ ){
            st  =   new StringTokenizer( br.readLine() );
            int start_point  =   Integer.parseInt( st.nextToken() );
            int end_point    =   Integer.parseInt( st.nextToken() );
            link.get( start_point-1 ).add( end_point );
            link.get( end_point-1 ).add( start_point );
        }

        boolean all_visit   =   false;
        while ( true ) {

            int start_node = 1;
            all_visit   =   true;
            for ( int i = 0 ; i < visit_checker.length ; i++ ){
                if ( visit_checker[i] == false ) {
                    all_visit = false;
                    start_node = i+1;
                    break;
                }
            }
            if ( all_visit == true )
                break;
            else {

                visit_checker = bfs(link, visit_checker, start_node);
                chunk_count++;
                //sb.append("\n");
            }
        }

        sb.append( chunk_count );
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

    private static boolean[] dfs(ArrayList<ArrayList<Integer>> link, boolean[] visit_checker, int start_node) {

        Stack<Integer> stack    =   new Stack<>();
        stack.push(start_node);
        visit_checker[ start_node-1 ] = true;

        while( !stack.isEmpty() ){
            start_node  =   stack.pop();
            //sb.append(start_node + " -> ");
            for ( int i = 0 ; i < link.get(start_node-1).size() ; i++ ){
                if ( visit_checker[ link.get(start_node-1).get(i)-1 ] != true ) {
                    stack.push(link.get(start_node - 1).get(i));
                    visit_checker[ link.get(start_node-1).get(i)-1 ] = true;
                }
            }
        }
        return visit_checker;
    }

    private static boolean[] bfs(ArrayList<ArrayList<Integer>> link, boolean[] visit_checker, int start_node) {

        Queue<Integer> queue =   new LinkedList<>();
        queue.add(start_node);
        visit_checker[ start_node-1 ] = true;


        while( !queue.isEmpty() ){
            start_node  =   queue.poll();
            //sb.append(start_node + " -> ");
            for ( int i = 0 ; i < link.get(start_node-1).size() ; i++ ){
                if ( visit_checker[ link.get(start_node-1).get(i)-1 ] != true ) {
                    queue.add(link.get(start_node - 1).get(i));
                    visit_checker[ link.get(start_node-1).get(i)-1 ] = true;
                }
            }
        }
        return visit_checker;
    }

}
