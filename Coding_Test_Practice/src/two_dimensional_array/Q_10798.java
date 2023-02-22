package two_dimensional_array;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_10798 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        ArrayList<String> inputs    =   new ArrayList<>();

        int max_length = -1;
        for ( int i = 0 ; i < 5 ; i++ ) {
            inputs.add(br.readLine());
            if ( max_length < inputs.get(i).length() )
                max_length = inputs.get(i).length();
        }

        String[][] array  =   new String[5][ max_length ];
        for ( int i = 0 ; i < 5 ; i++ ) {
            for ( int j = 0 ; j < max_length ; j++ ) {
                if ( j < inputs.get(i).length() )
                    array[i][j] = String.valueOf(inputs.get(i).charAt(j));
                else
                    array[i][j] = " ";
            }
        }

        for ( int i = 0 ; i < max_length ; i++ ){
            for ( int j = 0 ; j < 5 ; j++ ){
                if ( !array[j][i].equals(" ") )
                    sb.append ( array[j][i] );
            }
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
