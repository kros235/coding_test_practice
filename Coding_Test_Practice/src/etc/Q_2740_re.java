package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_2740_re {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int row_1 = Integer.parseInt(st.nextToken());
        int col_1 = Integer.parseInt(st.nextToken());

        int[][] matrix_1 = new int[row_1][col_1];
        for (int i = 0; i < row_1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < col_1; j++)
                matrix_1[i][j] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int row_2 = Integer.parseInt(st.nextToken());
        int col_2 = Integer.parseInt(st.nextToken());

        int[][] matrix_2 = new int[row_2][col_2];
        for (int i = 0; i < row_2; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < col_2; j++)
                matrix_2[i][j] = Integer.parseInt(st.nextToken());
        }

        int[][] result  =   get_multiplication(matrix_1, matrix_2);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                sb.append(result[i][j] + " ");
            }
            sb.append("\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

    private static int[][] get_multiplication(int[][] matrix_1, int[][] matrix_2) {


        int row = matrix_1.length;
        int col = matrix_2[0].length;
        int[][] arr = new int[row][col];

        for ( int result_row = 0 ; result_row < row ; result_row ++) {
            for (int i = 0; i < col; i++) {
                for (int j = 0; j < matrix_2.length; j++) {
                    arr[result_row][i] += matrix_1[result_row][j] * matrix_2[j][i];
                }
            }
        }
        return arr;
    }
}
