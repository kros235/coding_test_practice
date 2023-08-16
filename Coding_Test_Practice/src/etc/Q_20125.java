package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_20125 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int length = Integer.parseInt(br.readLine());
        String[][] cookie_monster = new String[length][length];
        int heart_row =   0, heart_column    =   0;


        // input
        for (int i = 0; i < length; i++) {
            String input    =   br.readLine();
            for (int j = 0; j < length; j++)
                cookie_monster[i][j]    =   String.valueOf( input.charAt(j) );
        }


        String heart_XY_result  =   find_heart  ( cookie_monster );
        StringTokenizer st      =   new StringTokenizer( heart_XY_result );

        heart_row =   Integer.parseInt( st.nextToken() ) + 1;
        heart_column =   Integer.parseInt( st.nextToken() ) + 1;

        sb.append ( heart_row + " " + heart_column + "\n");

        sb.append ( figure_left_arm_length( cookie_monster, heart_row-1, heart_column-1 ) + " " );
        sb.append ( figure_right_arm_length( cookie_monster, heart_row-1, heart_column-1 ) + " " );

        int spine_length    =   figure_spine_length( cookie_monster, heart_row-1, heart_column-1 );
        sb.append ( spine_length + " " );

        int leg_start_row      =   heart_row + spine_length + 1;
        int left_leg_start_column   =   heart_column - 1;
        sb.append ( figure_left_leg_length( cookie_monster, leg_start_row-1, left_leg_start_column-1 ) + " " );

        int right_leg_start_column   =   heart_column + 1;
        sb.append ( figure_right_leg_length( cookie_monster, leg_start_row-1, right_leg_start_column-1 ) + "\n" );

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

    private static String find_heart(String[][] cookie_monster) {

        String result = " ";
        int length  =   cookie_monster.length;

        for (int i = 0; i < length; i++) {
            boolean heart_found_checker =   false;
            for (int j = 0; j < length; j++) {

                if ( i >= 1 && i <= (length-2)
                        && j >= 1 && j <= (length-2) ){

                    if ( cookie_monster[i][j].equals(String.valueOf("*"))
                            &&  cookie_monster[i-1][j].equals(String.valueOf("*"))
                            &&  cookie_monster[i+1][j].equals(String.valueOf("*"))
                            &&  cookie_monster[i][j-1].equals(String.valueOf("*"))
                            &&  cookie_monster[i][j+1].equals(String.valueOf("*")) ){
                        result  =   i + " " + j;
                        heart_found_checker = true;
                        break;
                    }
                }

            }
            if ( heart_found_checker == true )
                break;
        }

        return result;
    }

    private static int figure_left_arm_length(String[][] cookie_monster, int heart_row, int heart_column) {
        int left_arm_length =   0;
        for ( int i = heart_column-1 ; i >= 0; i-- ){
            if ( cookie_monster[heart_row][i].equals(String.valueOf("*")) )
                left_arm_length ++;
        }
        return left_arm_length;
    }

    private static int figure_right_arm_length(String[][] cookie_monster, int heart_row, int heart_column) {
        int left_arm_length =   0;
        for ( int i = heart_column+1 ; i < cookie_monster.length ; i++ ){
            if ( cookie_monster[heart_row][i].equals(String.valueOf("*")) )
                left_arm_length ++;
        }
        return left_arm_length;
    }

    private static int figure_spine_length(String[][] cookie_monster, int heart_row, int heart_column) {
        int left_arm_length =   0;
        for ( int i = heart_row+1 ; i < cookie_monster.length ; i++ ){
            if ( cookie_monster[i][heart_column].equals(String.valueOf("*")) )
                left_arm_length ++;
        }
        return left_arm_length;
    }

    private static int figure_left_leg_length(String[][] cookie_monster, int left_leg_start_row, int left_leg_start_column) {
        int left_leg_length =   0;
        for ( int i = left_leg_start_row ; i < cookie_monster.length ; i++ ){
            if ( cookie_monster[i][left_leg_start_column].equals(String.valueOf("*")) )
                left_leg_length ++;
        }
        return left_leg_length;
    }

    private static int figure_right_leg_length(String[][] cookie_monster, int right_leg_start_row, int right_leg_start_column) {
        int right_leg_length =   0;
        for ( int i = right_leg_start_row ; i < cookie_monster.length ; i++ ){
            if ( cookie_monster[i][right_leg_start_column].equals(String.valueOf("*")) )
                right_leg_length ++;
        }
        return right_leg_length;
    }
}
