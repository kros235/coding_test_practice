


import java.io.*;
import java.util.*;

public class Main {


    public static int[][] map;
    public static boolean[][] visit;
    public static int row, col;

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            col = Integer.parseInt(st.nextToken());
            row = Integer.parseInt(st.nextToken());

            if (row == 0 && col == 0)
                break;
            else {
                int island_count = 0;

                map = new int[row][col];
                visit = new boolean[row][col];

                for (int i = 0; i < row; i++) {
                    st = new StringTokenizer(br.readLine());
                    for (int j = 0; j < col; j++) {
                        map[i][j] = Integer.parseInt(st.nextToken());
                    }
                }

                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        if (map[i][j] == 1 && visit[i][j] == false) {
                            island_count++;
                            //dfs(i, j);
                            bfs(i, j);
                        }
                    }
                }
                sb.append(island_count + "\n");
            }
        }
        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    private static void bfs(int row, int col) {
        int[] row_direction = new int[]{-1, 1, 0, 0,        -1, -1, 1, 1 };
        int[] col_direction = new int[]{0, 0, -1, 1,        -1, 1, -1, 1};

        Queue<land> queue = new LinkedList<>();
        queue.offer(new land(row, col));


        while (!queue.isEmpty()) {
            land current_land = queue.poll();
            visit[current_land.get_row()][current_land.get_col()] = true;

            for (int i = 0; i < 8; i++) {
                if (current_land.get_row() + row_direction[i] >= 0
                        && current_land.get_row() + row_direction[i] < map.length
                        && current_land.get_col() + col_direction[i] >= 0
                        && current_land.get_col() + col_direction[i] < map[0].length) {

                    if (visit[current_land.get_row() + row_direction[i]][current_land.get_col() + col_direction[i]] == false
                            && map[current_land.get_row() + row_direction[i]][current_land.get_col() + col_direction[i]] == 1) {
                        queue.offer(new land(current_land.get_row() + row_direction[i], current_land.get_col() + col_direction[i]));
                        visit[current_land.get_row() + row_direction[i]][current_land.get_col() + col_direction[i]] = true;
                    }
                } else
                    continue;
            }
        }


    }

    public static class land {
        int row;
        int col;

        public land(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public int get_row() {
            return row;
        }

        public int get_col() {
            return col;
        }
    }

    public static void dfs(int row, int col) {
        visit[row][col] = true;
        if (row - 1 >= 0 && col - 1 >= 0 && map[row - 1][col - 1] == 1 && visit[row - 1][col - 1] == false)
            dfs(row - 1, col - 1);

        if (row - 1 >= 0 && map[row - 1][col] == 1 && visit[row - 1][col] == false)
            dfs(row - 1, col);

        if (row - 1 >= 0 && col + 1 < map[0].length && map[row - 1][col + 1] == 1 && visit[row - 1][col + 1] == false)
            dfs(row - 1, col + 1);

        if (col - 1 >= 0 && map[row][col - 1] == 1 && visit[row][col - 1] == false)
            dfs(row, col - 1);

        if (col + 1 < map[0].length && map[row][col + 1] == 1 && visit[row][col + 1] == false)
            dfs(row, col + 1);

        if (row + 1 < map.length && col - 1 >= 0 && map[row + 1][col - 1] == 1 && visit[row + 1][col - 1] == false)
            dfs(row + 1, col - 1);

        if (row + 1 < map.length && map[row + 1][col] == 1 && visit[row + 1][col] == false)
            dfs(row + 1, col);

        if (row + 1 < map.length && col + 1 < map[0].length && map[row + 1][col + 1] == 1 && visit[row + 1][col + 1] == false)
            dfs(row + 1, col + 1);
    }

}