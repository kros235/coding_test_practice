package etc;

import java.io.*;
import java.util.ArrayList;

public class Q_1100 {

    public static String change_initial_color(String previous_one) {
        if (previous_one.equals("W"))
            return ("B");
        else
            return ("W");
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String starting_color = "W";
        int count   =   0;
        String[][] board    =   new String[8][8];

        // input
        for (int i = 0; i < 8; i++) {
            String input    =   br.readLine();
            for (int j = 0; j < 8; j++)
                board[i][j] = String.valueOf( input.charAt(j) );
        }


        // logic
        for (int i = 0; i < 8; i++) {
            if (i != 0)
                starting_color = change_initial_color(starting_color);

            for (int j = 0; j < 8; j++) {
                if ( starting_color.equals("W") && board[i][j].equals("F") )
                    count++;
                starting_color = change_initial_color(starting_color);
            }
        }

        sb.append( count + "\n");
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
