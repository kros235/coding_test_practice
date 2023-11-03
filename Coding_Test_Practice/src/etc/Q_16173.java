package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_16173 {

    public static int [][] maze;
    public static int n;
    public static String result = "Hing";
    public static void main(String args[]) throws IOException{

        BufferedReader br   =   new BufferedReader ( new InputStreamReader (System.in) );
        BufferedWriter bw   =   new BufferedWriter ( new OutputStreamWriter (System.out) );
        StringBuilder sb    =   new StringBuilder();

        n                   =   Integer.parseInt ( br.readLine() );
        maze                =   new int[n][n];
        //visit               =   new boolean[n][n];

        for ( int i = 0 ; i < n ; i++ ){
            StringTokenizer st  =   new StringTokenizer( br.readLine() );
            for ( int j = 0 ; j < n ; j++ )
                maze [i][j] =   Integer.parseInt ( st.nextToken() );
        }

        //visit[0][0] = true;
        dfs ( 0, 0, maze[0][0] );

        sb.append ( result );
        bw.write( sb.toString() );
        br.close();
        bw.close();
    }

    public static void dfs ( int i, int j, int jump_amount ){
        if(maze[i][j] == 0) return;
        //visit[i][j] =   true;
        if ( maze[i][j] == -1 ) {
            result = "HaruHaru";
            return;
        }
        else {
            if (i + jump_amount < n)
                dfs(i + jump_amount, j, maze[i + jump_amount][j]);
            if (j + jump_amount < n)
                dfs(i, j + jump_amount, maze[i][j + jump_amount]);
        }
    }
}
