package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_2468 {

    public static int[][] map;
    public static int safe_zone_count;
    public static boolean[][] visit;

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n   =   Integer.parseInt( br.readLine() );
        map     =   new int[n][n];

        int max_safe_zone   =   1;
        int max_height      =   -1;
        for ( int i = 0 ; i < n ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for ( int j = 0 ; j < n ; j++) {
                int temp    =   Integer.parseInt( st.nextToken() );
                map[i][j]   =   temp;

                if ( temp > max_height )
                    max_height =   temp;
            }
        }

        for ( int i = 1 ; i < max_height ; i++ ) {
            safe_zone_count = 0;
            visit = new boolean[n][n];

            for (int j = 0; j < n; j++){
                for (int k = 0; k < n; k++) {
                    if (map[j][k] > i && visit[j][k] == false) {
                        dfs( j, k, i);
                        safe_zone_count++;
                    }
                }
            }

            if ( safe_zone_count > max_safe_zone )
                max_safe_zone = safe_zone_count;
        }

        sb.append( max_safe_zone + "\n" );

        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    public static void dfs( int row, int col, int rain ){
        visit[row][col] =   true;

        // up
        if ( row-1 >=0 && map[row-1][col] > rain && visit[row-1][col] == false )
            dfs( row-1, col, rain );

        // down
        if ( row+1 < map.length && map[row+1][col] > rain && visit[row+1][col] == false )
            dfs( row+1, col, rain );

        // right
        if ( col+1 < map[0].length && map[row][col+1] > rain && visit[row][col+1] == false )
            dfs( row, col+1, rain );

        // left
        if ( col-1 >= 0 && map[row][col-1] > rain && visit[row][col-1] == false )
            dfs( row, col-1, rain );
    }
}
