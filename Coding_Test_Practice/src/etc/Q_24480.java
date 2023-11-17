package etc;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q_24480 {

    public static ArrayList<Integer>[] points;
    public static int[] visit;
    public static int order =   1;

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int nodes           =   Integer.parseInt( st.nextToken() );
        int lines           =   Integer.parseInt( st.nextToken() );
        int start_point     =   Integer.parseInt( st.nextToken() );

        points              =   new ArrayList[ nodes + 1 ];
        visit               =   new int      [ nodes + 1 ];

        for ( int i = 0 ; i < points.length ; i++ ){
            points[i]       =   new ArrayList<>();
        }

        for ( int i = 0 ; i < lines ; i++ ){
            st          =   new StringTokenizer( br.readLine() );
            int start   =   Integer.parseInt( st.nextToken() );
            int end     =   Integer.parseInt( st.nextToken() );

            points[start].add( end );
            points[end].add( start );
        }

        for ( int i = 0 ; i < points.length ; i++ ){
            Collections.sort( points[i], Collections.reverseOrder() );
        }

        dfs ( start_point );

        for ( int i = 1 ; i < visit.length ; i++ )
            sb.append ( visit[i] + "\n" );

        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    public static void dfs ( int start_point ){
        visit[ start_point ]    =   order++;

        for ( int i = 0 ; i < points[start_point].size() ; i++ ){
            if ( visit[ points[start_point].get(i) ] == 0 )
                dfs (  points[start_point].get(i) );

        }

    }
}
