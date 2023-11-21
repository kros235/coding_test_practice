package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q_2583 {

    public static int[][] map;
    public static boolean[][] visit;


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();



        StringTokenizer st  =   new StringTokenizer(br.readLine());
        int row             =   Integer.parseInt ( st.nextToken() );
        int col             =   Integer.parseInt ( st.nextToken() );
        int rect_count      =   Integer.parseInt ( st.nextToken() );

        map                 =   new int[row][col];
        visit               =   new boolean[row][col];

        int start_col, start_row, end_col, end_row;
        for ( int i = 0 ; i < rect_count ; i++ ){
            st  =   new StringTokenizer(br.readLine());
            start_col       =   Integer.parseInt ( st.nextToken() );
            start_row       =   Integer.parseInt ( st.nextToken() );
            end_col         =   Integer.parseInt ( st.nextToken() );
            end_row         =   Integer.parseInt ( st.nextToken() );



            for ( int j = start_row ; j < end_row ; j++ ){
                for ( int k = start_col ; k < end_col ; k++ ){
                    map[j][k]   =   1;
                }
            }
        }

        ArrayList<Integer> area     =   new ArrayList<>();

        for ( int i = 0 ; i < row ; i++ ){
            for ( int j = 0 ; j < col ; j++ ) {
                if ( map[i][j] == 0 && visit[i][j] == false )
                    area.add ( dfs( i, j ) );
            }
        }

        Collections.sort ( area );

        sb.append( area.size() + "\n" );
        for ( int i = 0 ; i < area.size() ; i++ )
            sb.append ( area.get(i) + " " );

        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    public static int dfs ( int row, int col ){
        int area_count  =   1;
        visit[ row ][ col ]     =   true;

        // up
        if ( row-1 >= 0 && map[row-1][col] == 0 && visit[row-1][col] == false )
            area_count += dfs ( row - 1 , col );

        // down
        if ( row+1 < map.length && map[row+1][col] == 0 && visit[row+1][col] == false )
            area_count += dfs ( row + 1 , col );

        // left
        if ( col-1 >= 0 && map[row][col-1] == 0 && visit[row][col-1] == false )
            area_count += dfs ( row, col - 1 );

        // right
        if ( col+1 < map[0].length && map[row][col+1] == 0 && visit[row][col+1] == false )
            area_count += dfs ( row , col + 1 );

        return area_count;
    }

}
