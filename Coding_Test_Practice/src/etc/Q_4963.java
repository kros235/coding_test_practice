package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_4963 {

    public static int[][] map;
    public static boolean[][] visit;
    public static int row, col;

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while( true ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            col = Integer.parseInt(st.nextToken());
            row = Integer.parseInt(st.nextToken());

            if ( row == 0 && col == 0 )
                break;
            else{
                int island_count    =   0;

                map     =   new int[ row ][ col ];
                visit   =   new boolean[ row ][ col ];

                for ( int i = 0 ; i < row ; i++ ){
                    st = new StringTokenizer(br.readLine());
                    for ( int j = 0 ; j < col ; j++ ){
                        map[i][j]   =   Integer.parseInt( st.nextToken() );
                    }
                }

                for ( int i = 0 ; i < row ; i++ ){
                    for ( int j = 0 ; j < col ; j++ ){
                        if ( map[i][j] == 1 && visit[i][j] == false ) {
                            island_count ++;
                            dfs(i, j);
                        }
                    }
                }
                sb.append ( island_count + "\n" );
            }
        }
        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    public static void dfs ( int row, int col ){
        visit[row][col] = true;
        if ( row-1 >= 0 && col-1 >= 0 && map[row-1][col-1] == 1 && visit[row-1][col-1] == false )
            dfs ( row-1, col-1 );

        if ( row-1 >= 0 && map[row-1][col] == 1 && visit[row-1][col] == false)
            dfs ( row-1, col );

        if ( row-1 >= 0 && col+1 < map[0].length && map[row-1][col+1] == 1 && visit[row-1][col+1] == false)
            dfs ( row-1, col+1 );

        if ( col-1 >= 0 && map[row][col-1] == 1 && visit[row][col-1] == false)
            dfs ( row, col-1 );

        if ( col+1 < map[0].length && map[row][col+1] == 1 && visit[row][col+1] == false)
            dfs ( row, col+1 );

        if ( row+1 < map.length && col-1 >= 0 && map[row+1][col-1] == 1 && visit[row+1][col-1] == false)
            dfs ( row+1, col-1 );

        if ( row+1 < map.length && map[row+1][col] == 1 && visit[row+1][col] == false)
            dfs ( row+1, col );

        if ( row+1 < map.length && col+1 < map[0].length && map[row+1][col+1] == 1 && visit[row+1][col+1] == false)
            dfs ( row+1, col+1 );
    }
}
