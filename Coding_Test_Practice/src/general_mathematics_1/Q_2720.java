package general_mathematics_1;

import java.io.*;
import java.util.ArrayList;

public class Q_2720 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        int round   =    Integer.parseInt( br.readLine() );
        for ( int i = 0 ; i < round ; i++ ){
            int cost    =   Integer.parseInt( br.readLine() );
            String result = get_change_result_string( cost );
            sb.append( result + "\n" );
        }

        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();

    }

    private static String get_change_result_string(int cost) {
        int Quarter  =   0;
        int Dime     =   0;
        int Nickel   =   0;
        int Penny    =   0;

        while ( true ){
            if ( cost >= 25 ){
                Quarter += cost / 25;
                cost %= 25;
                continue;
            }
            else if ( cost >= 10 ){
                Dime += cost / 10;
                cost %= 10;
            }
            else if ( cost >= 5 ){
                Nickel += cost / 5;
                cost %= 5;
            }
            else{
                Penny += cost / 1;
                break;
            }
        }
        return Quarter + " " + Dime + " " + Nickel + " " + Penny;
    }
}
