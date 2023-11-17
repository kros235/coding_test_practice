package etc;

import java.io.*;
import java.util.*;

public class Q_2644_re {


    public static String[] node;
    public static int[] visit;

    public static int result    =   0;

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int ppl     =   Integer.parseInt( br.readLine() );
        node        =   new String [ ppl + 1 ];
        visit       =   new int[ ppl + 1 ];

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int A               =   Integer.parseInt( st.nextToken() );
        int B               =   Integer.parseInt( st.nextToken() );

        int round           =   Integer.parseInt( br.readLine() );


        for ( int i = 0 ; i < node.length ; i++ ){
            node[i] =   "";
        }
        for ( int i = 0 ; i < round ; i++ ){
            st          =   new StringTokenizer( br.readLine() );
            int start   =   Integer.parseInt( st.nextToken() );
            int end     =   Integer.parseInt( st.nextToken() );

            node[start] +=  String.valueOf (end) + " ";
            node[end]   +=  String.valueOf (start) + " ";
        }

        int family_count    =   1;
        dfs( A, B , family_count++, 0 );

        if ( visit[A] != visit[B] )
            result  =   -1;

        sb.append ( result + "\n" );

        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    public static void dfs( int start_node, int destination, int family_count, int count ){
        visit[start_node]   =   family_count;
        if ( start_node == destination ) {
            result  =   count;
            return;
        }
        else {

            StringTokenizer st = new StringTokenizer(node[start_node]);
            int round = st.countTokens();

            for (int i = 0; i < round; i++) {
                int temp = Integer.parseInt(st.nextToken());
                if (visit[temp] == 0) {
                    dfs(temp, destination, family_count, count + 1);
                }
            }
        }
    }

}
