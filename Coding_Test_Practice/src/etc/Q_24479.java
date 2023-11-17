package etc;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q_24479 {

    public static ArrayList<Integer>[] node;
    public static int[] visit;

    public static int order    =   1;

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int nodes           =   Integer.parseInt( st.nextToken() );
        int lines           =   Integer.parseInt( st.nextToken() );
        int start_point     =   Integer.parseInt( st.nextToken() );

        node                =   new ArrayList[nodes + 1 ];
        visit               =   new int[ nodes + 1 ];



        for ( int i = 0 ; i < nodes+1 ; i++ ){
            node[i] =   new ArrayList<>();
        }

        for ( int i = 0 ; i < lines ; i++ ){
            st          =   new StringTokenizer( br.readLine() );
            int start   =   Integer.parseInt( st.nextToken() );
            int end     =   Integer.parseInt( st.nextToken() );

            node[start].add(end);
            node[end].add(start);
        }


        for ( int i = 0 ; i < node.length ; i++ ){
            if ( node[i].size() > 1 )
                Collections.sort( node[i] );
        }

        dfs ( start_point );


        for ( int i = 1 ; i < visit.length ; i++ ){
            sb.append ( visit[i] + "\n" );
        }




        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    public static void dfs ( int start_point ){
        visit[start_point] = order++;


        for ( int j = 0 ; j < node[start_point].size() ; j++ ){
            if ( visit[ node[start_point].get(j) ] == 0 ){
                dfs ( node[start_point].get(j) );
            }
        }


    }
}
