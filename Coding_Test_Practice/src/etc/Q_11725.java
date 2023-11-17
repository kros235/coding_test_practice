package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_11725 {

    public static String[] map;
    public static int[] visit_from;


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int node    =   Integer.parseInt( br.readLine() );

        map         =   new String[node+1];
        visit_from  =   new int[node+1];
        visit_from[1]   =   -1;

        for ( int i = 0 ; i < node+1 ; i++ )
            map[i]  =   "";

        for ( int i = 0 ; i < node-1 ; i++ ){
            StringTokenizer st  =   new StringTokenizer( br.readLine() );
            int start           =   Integer.parseInt( st.nextToken() );
            int end             =   Integer.parseInt( st.nextToken() );

            map[start]         +=   String.valueOf( end ) + " ";
            map[end]           +=   String.valueOf( start ) + " ";
        }

        dfs ( 1 );

        for ( int i = 2 ; i < visit_from.length ; i++ )
            sb.append ( visit_from[i] + "\n" );

        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    public static void dfs( int start_node ){
        StringTokenizer st  =   new StringTokenizer( map[start_node] );
        if ( st.countTokens() > 0 ){
            int round   =   st.countTokens();

            for ( int i = 0 ; i < round ; i++ ){
                int connected_node    =   Integer.parseInt( st.nextToken() );
                if ( visit_from[ connected_node ] == 0 ){
                    visit_from[ connected_node ] = start_node;
                    dfs ( connected_node );
                }
            }
        }

    }
}
