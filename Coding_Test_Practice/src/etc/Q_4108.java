package etc;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q_4108 {

    public static int[][] mine;

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String input = br.readLine();
            if (input.equals("0 0") == false) {
                StringTokenizer st = new StringTokenizer(input);
                int row = Integer.parseInt(st.nextToken());
                int col = Integer.parseInt(st.nextToken());

                mine = new int[row][col];


                for (int i = 0; i < row; i++) {
                    String map = br.readLine();
                    for (int j = 0; j < col; j++) {
                        if (String.valueOf(map.charAt(j)).equals("*") == true) {
                            mine[i][j] = -1;
                            add_nearby(i, j);
                        } else
                            continue;
                    }
                }

                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        if (mine[i][j] < 0)
                            sb.append("*");
                        else
                            sb.append(mine[i][j]);
                    }
                    sb.append("\n");
                }
            } else
                break;
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

    private static void add_nearby(int mine_x, int mine_y) {

        // 왼쪽 위
        if ( ( mine_x - 1 ) >= 0    &&  ( mine_y - 1 ) >= 0 ) {
            if ( mine[mine_x - 1][mine_y - 1] >= 0 )
                mine[mine_x - 1][mine_y - 1]++;
        }

        // 바로 위
        if ( ( mine_x - 1 ) >= 0 ) {
            if ( mine[mine_x - 1][mine_y] >= 0 )
                mine[mine_x - 1][mine_y]++;
        }

        // 오른쪽 위
        if ( ( mine_x - 1 ) >= 0    &&  ( mine_y + 1 ) < mine[0].length ) {
            if ( mine[mine_x - 1][mine_y + 1] >= 0 )
                mine[mine_x - 1][mine_y + 1]++;
        }

        // 바로 왼쪽
        if ( ( mine_y - 1 ) >= 0 ) {
            if ( mine[mine_x][mine_y - 1] >= 0 )
                mine[mine_x][mine_y - 1]++;
        }

        // 바로 오른쪽
        if ( ( mine_y + 1 ) < mine[0].length ) {
            if ( mine[mine_x][mine_y + 1] >= 0 )
                mine[mine_x][mine_y + 1]++;
        }

        // 왼쪽 아래
        if ( ( mine_x + 1 ) < mine.length    &&  ( mine_y - 1 ) >= 0 ) {
            if ( mine[mine_x + 1][mine_y - 1] >= 0 )
                mine[mine_x + 1][mine_y - 1]++;
        }

        // 바로 아래
        if ( ( mine_x + 1 ) < mine.length ) {
            if ( mine[mine_x + 1][mine_y] >= 0 )
                mine[mine_x + 1][mine_y]++;
        }

        // 오른쪽 아래
        if ( ( mine_x + 1 ) < mine.length    &&  ( mine_y + 1 ) < mine[0].length ) {
            if ( mine[mine_x + 1][mine_y + 1] >= 0 )
                mine[mine_x + 1][mine_y + 1]++;
        }

    }

}
