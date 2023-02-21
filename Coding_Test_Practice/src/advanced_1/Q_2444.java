package advanced_1;

import java.io.*;
import java.util.ArrayList;

public class Q_2444 {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int round = Integer.parseInt(br.readLine());
        int counter =   round - 1;

        for (int i = 1; i <= round * 2 - 1   ; i++) {

            if ( i <= round){

                for ( int j = (round - 1) - i ; j >= 0 ; j-- )
                    sb.append(" ");

                for ( int k = 0 ; k < 2 * i - 1 ; k ++)
                    sb.append("*");

            }

            else {
                for ( int j = 0 ; j < round - counter ; j++ )
                    sb.append(" ");

                for (int k = 2 * counter - 1 ; k > 0 ; k--)
                    sb.append("*");

                counter--;
            }

            sb.append("\n");
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }
}
