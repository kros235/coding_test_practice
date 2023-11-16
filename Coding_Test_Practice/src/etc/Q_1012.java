package etc;

import java.io.*;
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
                        dfs(i, j);
                    }
                }
            }

            sb.append(worm_count + "\n");
        }
        bw.write(sb.toString());
        br.close();
        bw.close();
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
