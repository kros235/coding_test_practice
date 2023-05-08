package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_10709 {

    private static int[][] get_estimation(String[][] cloud, int row, int column) {
        int[][] estimation  =   new int[row][column];

        for ( int i = 0 ; i < row ; i++ ){
            int count  =    0;
            for ( int j = 0 ; j < column ; j++ ){
                if ( cloud[i][j].equals("c") == true ){
                    count = 0;
                    estimation[i][j] = 0;
                    count++;
                }
                else if ( cloud[i][j].equals(".") == true && count == 0 ) {
                    estimation[i][j] = -1;
                }
                else //if ( cloud[i][j].equals(".") == true && count != 0 ) {
                    estimation[i][j] = count++;
                //}
            }
        }
        return estimation;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int row     =   Integer.parseInt(st.nextToken());
        int column  =   Integer.parseInt(st.nextToken());
        String[][] cloud    =   new String[row][column];

        for ( int i = 0 ; i < row ; i++ ){
            String input    =   br.readLine();
            for ( int j = 0 ; j < column ; j++ )
                cloud[i][j]   = String.valueOf( input.charAt(j) );
        }

        int[][] weather_forecast =   get_estimation( cloud, row, column );

        for ( int i = 0 ; i < row ; i++ ){
            for ( int j = 0 ; j < column ; j++ ){
                sb.append( weather_forecast[i][j] + " " );
            }
            sb.append("\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
