package brute_force;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_1018 {


    public static String[][] copy_partial_board(String[][] board, int row, int column) {

        String[][] cut_board = new String[8][8];

        for (int i = row ; i < row + 8 ; i++ ){
            for (int j = column ; j < column + 8 ; j++ ){
                cut_board[i-row][j-column] = board[i][j];
            }
        }

        return cut_board;
    }

    public static int find_minimum_change(String[][] board) {

        int w_starting, b_starting;

        w_starting = find_minimum_change_starts(board, "W");
        b_starting = find_minimum_change_starts(board, "B");

        if (w_starting < b_starting)
            return w_starting;
        else
            return b_starting;
    }

    public static int find_minimum_change_starts(String[][] board, String starting_Char) {

        int count = 0;
        String current_Char;

        for (int i = 0; i < board.length; i++) {
            if (i != 0) {
                if (starting_Char.equals("W") == true)
                    starting_Char = "B";
                else
                    starting_Char = "W";
            }

            current_Char = starting_Char;
            for (int j = 0; j < board[i].length; j++) {
                if (j != 0) {

                    if (current_Char.equals("B"))
                        current_Char = "W";
                    else
                        current_Char = "B";
                }

                // ==================================
                // comparison
                // ==================================
                if (board[i][j].equals(current_Char) == false)
                    count++;

            }
        }
        return count;
    }

    public static int find_min_value(ArrayList<Integer> results){
        int min =   999;

        for ( int i = 0 ; i < results.size() ; i++ ){
            if ( min > results.get(i) )
                min =   results.get(i);
        }
        return min;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int vertical_size = Integer.parseInt(st.nextToken());
        int horizontal_size = Integer.parseInt(st.nextToken());


        String[][] board = new String[vertical_size][horizontal_size];

        // ============================================================
        // input
        // ============================================================
        for (int i = 0; i < vertical_size; i++) {
            String input = br.readLine();
            for (int j = 0; j < horizontal_size; j++)
                board[i][j] = String.valueOf(input.charAt(j));
        }

        // ============================================================
        // logic function
        // ============================================================

        ArrayList<Integer> results  =   new ArrayList<>();

        // get index, copy_partial_board
        for (int i = 0; i < vertical_size; i++) {

            if ((i + 8) <= vertical_size) {

                for (int j = 0; j < horizontal_size; j++) {
                    if ((j + 8) <= horizontal_size) {
                        String[][] cut_board = copy_partial_board ( board, i, j);
                        results.add ( find_minimum_change( cut_board ) );
                    }
                    else break;
                }
            }
            else break;
        }

        int result  =   find_min_value( results );

        sb.append(result + "\n");
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }
}
