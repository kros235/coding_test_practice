package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_1388 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer(br.readLine());

        int row =    Integer.parseInt( st.nextToken() );
        int col =    Integer.parseInt( st.nextToken() );

        String[][] tile   =   new String[row][col];
        for ( int i = 0 ; i < row ; i++ ){
            String input    = br.readLine();
            for ( int j = 0 ; j < col ; j++ )
                tile[i][j]  =   String.valueOf( input.charAt(j) );
        }

        int tile_sum    =   0;
        tile_sum        +=  find_horizontal_tiles   ( tile );
        tile_sum        +=  find_vertical_tiles     ( tile );

        sb.append ( tile_sum + "\n" );
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

    private static int find_horizontal_tiles(String[][] tile) {

        int sum =   0;

        for ( int i = 0 ; i < tile.length ; i++ ){

            int layer_tile_sum;
            if ( tile[i][0].equals( String.valueOf("-" ) ) == true )
                layer_tile_sum  =   1;
            else
                layer_tile_sum  =   0;

            for ( int j = 1 ; j < tile[i].length ; j++ ){
                if ( tile[i][j-1].equals( String.valueOf("|" ) ) == true
                        && tile[i][j].equals( String.valueOf("-" ) ) == true)
                    layer_tile_sum++;
            }
            sum += layer_tile_sum;
        }
        return sum;
    }

    private static int find_vertical_tiles(String[][] tile) {


        int sum =   0;

        for ( int i = 0 ; i < tile[0].length ; i++ ){

            int layer_tile_sum;
            if ( tile[0][i].equals( String.valueOf("|" ) ) == true )
                layer_tile_sum  =   1;
            else
                layer_tile_sum  =   0;

            for ( int j = 1 ; j < tile.length ; j++ ){
                if ( tile[j-1][i].equals( String.valueOf("-" ) ) == true
                        && tile[j][i].equals( String.valueOf("|" ) ) == true)
                    layer_tile_sum++;
            }
            sum += layer_tile_sum;
        }
        return sum;

    }
}
