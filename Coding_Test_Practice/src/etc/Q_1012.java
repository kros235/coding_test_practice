package etc;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_1012 {

    public static boolean[][] visit ;
    public static int[][] field;
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();



        int round = Integer.parseInt ( br.readLine() );

        for ( int m = 0 ; m < round ; m++ ) {
            int worm_count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());

            int col = Integer.parseInt(st.nextToken());
            int row = Integer.parseInt(st.nextToken());
            int position_count = Integer.parseInt(st.nextToken());

            field = new int[row][col];
            visit = new boolean[row][col];
            for (int i = 0; i < position_count; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                field[y][x] = 1;
            }

            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if (field[i][j] == 1 && visit[i][j] == false) {
                        worm_count++;
                        visit[i][j] = true;
                        //dfs(i, j);
                        bfs( i , j );
                    }
                }
            }

            sb.append(worm_count + "\n");
        }
        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    public static void bfs ( int i, int j ){
        Queue<int[]> queue   =   new LinkedList<>();
        queue.offer ( new int[] { i, j } );
        //        위 아래  좌  우
        int[] X = {0, 0, -1, +1};
        int[] Y = {-1, +1, 0, 0};

        while ( !queue.isEmpty() ){
            int[] poll  =   queue.poll();

            for ( int m = 0 ; m < 4 ; m++ ){
                int x   =   poll[0] + X[m];
                int y   =   poll[1] + Y[m];

               //좌표가 배추밭을 벗어나게되면 다음 좌표를 체크해야한다
                if(x < 0 || x >= field.length || y < 0 || y >= field[0].length ){
                    continue;
                }

                //상하좌우 움직인 좌표에 배추가 있고, 체크하지 않은 좌표이면
                if(field[x][y] == 1 & !visit[x][y]){
                    queue.offer(new int[] {x, y});
                    //좌표를 저장한다.
                    visit[x][y] = true;
                    //체크한다
                }

            }
        }
    }

    public static void dfs ( int i, int j ){

        if ( i-1 >= 0 ) {
            if (field[i - 1][j] == 1 && visit[i - 1][j] == false) {
                visit[i - 1][j] = true;
                dfs(i - 1, j);
            }
        }

        if ( j-1 >= 0 ) {
            if (field[i][j-1] == 1 && visit[i][j-1] == false) {
                visit[i][j-1] = true;
                dfs(i, j-1);
            }
        }


        if ( i+1 < field.length ) {
            if (field[i + 1][j] == 1 && visit[i + 1][j] == false) {
                visit[i + 1][j] = true;
                dfs(i + 1, j);
            }
        }
        if ( j+1 < field[i].length ) {
            if (field[i][j + 1] == 1 && visit[i][j + 1] == false) {
                visit[i][j + 1] = true;
                dfs(i, j + 1);
            }
        }
    }
}
