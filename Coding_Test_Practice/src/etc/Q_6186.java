package etc;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q_6186 {

    public static String[][]  field;
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int row = Integer.parseInt( st.nextToken() );
        int col = Integer.parseInt( st.nextToken() );

        field   =   new String[row][col];

        for ( int i = 0 ; i < row ; i++ ) {
            String input    =   br.readLine();
            for ( int j = 0 ; j < input.length() ; j++ )
                field[i][j] =   String.valueOf( input.charAt(j) );
        }


        int result  =   0;

        for ( int i = 0 ; i < row ; i++ ) {
            for ( int j = 0 ; j < col ; j++ )
                if ( field[i][j].equals( String.valueOf( "#" ) ) )
                    result  +=  count_chunk(i, j, row, col);
        }


        sb.append ( result + "\n");
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

    private static int count_chunk(int i, int j, int row, int col ) {

        boolean upper_check     =   false;
        boolean left_check      =   false;
        boolean right_check     =   false;
        boolean bottom_check    =   false;


        if ( (i-1) < 0 )
            upper_check = false;
        else{
            if ( field[i-1][j].equals( String.valueOf("#") ) )
                upper_check =   true;
        }


        if ( (i+1) >= row )
            bottom_check = false;
        else{
            if ( field[i+1][j].equals( String.valueOf("#") ) )
                bottom_check =   true;
        }


        if ( (j-1) < 0 )
            left_check  =   false;
        else {
            if ( field[i][j-1].equals( String.valueOf("#") ) )
                left_check =   true;
        }


        if ( (j+1) >= col )
            right_check =   false;
        else{
            if ( field[i][j+1].equals( String.valueOf("#") ) )
                right_check =   true;
        }

        if ( upper_check == false && bottom_check == false
                &&  left_check == false && right_check == false )
            return 1;
        else {
            field[i][j]    =   ".";
            return 0;
        }
    }

}
