
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static int[][] visit;
    public static int[][] field;
    public static int count =   0, row, col;


    public static void main(String args[]) throws IOException {

        BufferedReader br   =   new BufferedReader ( new InputStreamReader( System.in ) );
        BufferedWriter bw   =   new BufferedWriter ( new OutputStreamWriter( System.out ) );
        StringBuilder sb    =   new StringBuilder();

        int round           =   Integer.parseInt ( br.readLine() );


        for ( int i = 0 ; i < round ; i++ ){
            StringTokenizer st  =   new StringTokenizer( br.readLine() );
            col                 =   Integer.parseInt ( st.nextToken() );
            row                 =   Integer.parseInt ( st.nextToken() );
            int cabbage         =   Integer.parseInt ( st.nextToken() );

            field               =   new int[row+1][col+1];
            visit               =   new int[row+1][col+1];
            count   =   0;

            for ( int j = 0 ; j < cabbage ; j++ ){
                st              =   new StringTokenizer( br.readLine() );
                int x           =   Integer.parseInt ( st.nextToken() );
                int y           =   Integer.parseInt ( st.nextToken() );
                field[y][x]     =   1;
            }


            for ( int j = 0 ; j < row + 1 ; j++ ){
                for ( int k = 0 ; k < col + 1 ; k++ ){
                    if ( field[j][k] == 1 && visit[j][k] == 0){
                        count++;
                        dfs ( j, k, count );
                    }
                    else
                        continue;
                }
            }
            sb.append ( count + "\n" );
        }

        bw.write ( sb.toString() );
        br.close();
        bw.close();
    }

    public static void dfs ( int x, int y, int count ){
        visit[x][y] =   count;
        if ( x+1 <= row && visit[x+1][y] == 0 && field[x+1][y] == 1)
            dfs ( x + 1, y, count );
        if ( y+1 <= col && visit[x][y+1] == 0 && field[x][y+1] == 1 )
            dfs ( x, y + 1, count );
    }
    /*

    1
    10 6 14
    0 0
    1 0
    1 1
    2 4
    3 4
    4 2
    4 3
    4 5
    7 4
    7 5
    8 4
    8 5
    9 4
    9 5


     */

}