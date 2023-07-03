package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_1717_re {

    private static int[] paths;
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int nodes   =   Integer.parseInt( st.nextToken() );
        int lines   =   Integer.parseInt( st.nextToken() );

        paths =   new int[ nodes + 1 ];
        for ( int i = 0 ; i < paths.length ; i++ )
            paths[i] =   i;


        for ( int i = 0 ; i < lines ; i++ ){
            st  =   new StringTokenizer( br.readLine() );
            int operation        =   Integer.parseInt( st.nextToken() );
            int node_a           =   Integer.parseInt( st.nextToken() );
            int node_b           =   Integer.parseInt( st.nextToken() );
            int temp;

            if ( node_a > node_b ){
                temp    =   node_a;
                node_a  =   node_b;
                node_b  =   temp;
            }

            if ( operation == 0 )
                union ( paths, node_a, node_b );
            else {
                boolean result = check_same(node_a, node_b);
                if ( result == true )
                    sb.append("YES\n");
                else
                    sb.append("NO\n");
            }
        }

        bw.write( String.valueOf( sb ) );
        bw.flush();
        br.close();
        bw.close();
    }


    private static void union(int[] paths, int node_a, int node_b) {
        node_a =   find( node_a );
        node_b =   find( node_b );

        if ( node_a != node_b ){
            paths[ node_b ] = node_a;
        }
    }

    private static int find(int node_a) {
        if ( node_a == paths[node_a] )
            return node_a;
        else
            return paths[node_a] = find ( paths[ node_a ] );
    }

    private static boolean check_same(int node_a, int node_b) {
        node_a =   find( node_a );
        node_b =   find( node_b );

        if ( node_a != node_b )
            return false;
        else
            return true;
    }
}

