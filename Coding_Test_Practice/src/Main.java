import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static String[][] result;

    public static void draw_square(int amount, int startX, int startY, boolean check_blank) {

        int block_Size = amount / 3;
        int counter = 0;

        if (block_Size == 1 && check_blank == true) {
            for (int i = startY; i < startY + amount; i++) {
                for (int j = startX; j < startX + amount; j++) {
                    if (counter == 5 * block_Size - 1) {
                        result[i][j] = " ";
                    } else
                        result[i][j] = "*";
                    counter++;
                }
            }
        }
        else if (check_blank == false){
            for (int i = startY; i < startY + amount; i++) {
                for (int j = startX; j < startX + amount; j++) {
                        result[i][j] = " ";
                }
            }
        }
        else{
            for (int i = startY; i < startY + amount; i+= block_Size) {
                for (int j = startX; j < startX + amount; j+=block_Size) {

                    if (counter == 5 - 1) {
                        draw_square(amount/3, i, j, false);
                    } else
                        draw_square(amount/3, i, j, true);
                    counter++;
                }
            }
        }



        /*
        counter ++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
        */
    }

        public static int log3(int amount) {
            return (int) (Math.log(amount) / Math.log(3));
        }



    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int amount      =   Integer.parseInt( br.readLine() );
        int exponent    =   log3(amount);

        if ( exponent >= 1 && exponent < 8){

            result = new String[amount][amount];

            draw_square( amount, 0,0 , true);

            for ( int i = 0 ; i < result.length ; i++ ) {
                for ( int j = 0 ; j < result[i].length ; j++ )
                    bw.write(result[i][j]);
                bw.write("\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
