package etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_2667 {


    public static int[][] map;
    public static int[][] visit;

    public static int section   =   1;

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int n               =   Integer.parseInt( st.nextToken() );
        map                 =   new int[n][n];
        visit               =   new int[n][n];

        for ( int i = 0 ; i < n ; i++ ){
            String input    =   br.readLine();
            for ( int j = 0 ; j < n ; j++ ){
                map[i][j]   =   Integer.parseInt( String.valueOf( input.charAt(j) ) );
            }
        }

        for ( int i = 0 ; i < n ; i++ ){
            for ( int j = 0 ; j < n ; j++ ){
                if ( map[i][j] == 1 && visit[i][j] == 0 )
                    dfs ( i, j, section++ );
            }
        }


        int[] section_count =   new int [ section ];
        for ( int i = 0 ; i < visit.length ; i++ ){
            for ( int j = 0 ; j < visit[0].length ; j++ ){
                if ( visit[i][j] != 0 ){
                    section_count[ visit[i][j] ] ++;
                }
            }
        }

        Arrays.sort( section_count );

        sb.append ( (section-1) + "\n" );
        for ( int i = 1 ; i < section_count.length ; i++ )
            sb.append( section_count[i] + "\n" );

        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    public static void dfs( int row, int col, int section ){
        visit[ row ][ col ] =   section;

        // up
        if ( row-1 >= 0 && visit[row-1][col] == 0 && map[row-1][col] == 1 )
            dfs ( row-1, col, section );

        // down
        if ( row+1 < map.length && visit[row+1][col] == 0 && map[row+1][col] == 1 )
            dfs ( row+1, col, section );

        // left
        if ( col-1 >= 0 && visit[row][col-1] == 0 && map[row][col-1] == 1 )
            dfs ( row, col-1, section );

        // right
        if ( col+1 < map[0].length && visit[row][col+1] == 0 && map[row][col+1] == 1 )
            dfs ( row, col+1, section );
    }

}
