package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_13565 {


    public static int[][] map;
    public static boolean[][] visit;
    public static boolean reached   =   false;

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int row             =   Integer.parseInt( st.nextToken() );
        int col             =   Integer.parseInt( st.nextToken() );

        map                 =   new int[row][col];
        visit               =   new boolean[row][col];

        for ( int i = 0 ; i < row ; i++ ){
            String input    =   br.readLine();
            for ( int j = 0 ; j < col ; j++ ){
                map[i][j]   =   Integer.parseInt( String.valueOf( input.charAt(j) ) );
            }
        }

        for ( int i = 0 ; i < col ; i++ ){
            if ( reached == true )
                break;
            if ( map[0][i] == 0 && visit[0][i] == false )
                dfs ( 0, i );
        }


        if ( reached == true )
            sb.append ( "YES\n" );
        else
            sb.append ( "NO\n" );

        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    public static void dfs ( int row, int col ){
        visit[row][col] =   true;

        if ( row == map.length-1 )
            reached =   true;

        // up
        if ( row-1 >= 0 && visit[row-1][col] == false &&  map[row-1][col] == 0  )
            dfs( row-1, col );

        // left
        if ( col-1 >= 0 && visit[row][col-1] == false &&  map[row][col-1] == 0 )
            dfs( row, col-1 );

        // right
        if ( col+1 < map[0].length && visit[row][col+1] == false  &&  map[row][col+1] == 0 )
            dfs( row, col+1 );

        // down
        if ( row+1 < map.length && visit[row+1][col] == false  &&  map[row+1][col] == 0 )
            dfs( row+1, col );
    }

}
