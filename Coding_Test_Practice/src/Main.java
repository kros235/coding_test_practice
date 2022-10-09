import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static String get_remained_missing_coodrinate(int[] x_coordinate, int[] y_coordinate) {

        int x = 0, y = 0;

        for ( int i = 0 ; i < 3 ; i++ ) {
            if ( x_coordinate[i] == x_coordinate[ i+1 ] ) {
                x = x_coordinate[i + 2];
                break;
            }
            else {
                x = x_coordinate[i];
                break;
            }
        }

        for ( int i = 0 ; i < 3 ; i++ ) {
            if (y_coordinate[i] == y_coordinate[i + 1]) {
                y = y_coordinate[i + 2];
                break;
            } else {
                y = y_coordinate[i];
                break;
            }
        }

        return x + " " + y;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] x_coordinate = new int[3];
        int[] y_coordinate = new int[3];

       for ( int i = 0 ; i < 3 ; i++ ){
           String[] coordinate = br.readLine().split(" ");
           int x    =   Integer.parseInt( coordinate[0] );
           int y    =   Integer.parseInt( coordinate[1] );

           if ( x < 1 && x > 1000
               || y < 1 && y > 1000){}
           else{
                x_coordinate[i] = x;
                y_coordinate[i] = y;
           }
       }

       Arrays.sort( x_coordinate );
       Arrays.sort( y_coordinate );

       String result = get_remained_missing_coodrinate ( x_coordinate, y_coordinate);

       bw.write( result );

        bw.flush();
        br.close();
        bw.close();
    }
}