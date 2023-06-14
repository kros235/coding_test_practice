import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        long     target_num       =   Integer.parseInt( br.readLine() );
        long     total_digit      =   0;


        if ( target_num == 100000000 ) {
            total_digit += 9;
            target_num  -= 1;
        }
        if ( target_num >= 10000000 &&    target_num < 100000000 ) {
            total_digit += (target_num - 10000000 + 1) * 8;
            target_num  -= ( target_num - 10000000 + 1 );
        }
        if ( target_num >= 1000000 &&    target_num < 10000000 ) {
            total_digit += (target_num - 1000000 + 1) * 7;
            target_num  -= ( target_num - 1000000 + 1 );
        }
        if ( target_num >= 100000 &&    target_num < 1000000 ) {
            total_digit += (target_num - 100000 + 1) * 6;
            target_num  -= ( target_num - 100000 + 1 );
        }
        if ( target_num >= 10000 &&    target_num < 100000 ) {
            total_digit += (target_num - 10000 + 1) * 5;
            target_num  -= ( target_num - 10000 + 1 );
        }
        if ( target_num >= 1000 &&    target_num < 10000 ) {
            total_digit += (target_num - 1000 + 1) * 4;
            target_num  -= ( target_num - 1000 + 1 );
        }
        if ( target_num >= 100 &&    target_num < 1000 ) {
            total_digit += (target_num - 100 + 1) * 3;
            target_num  -= ( target_num - 100 + 1 );
        }
        if ( target_num >= 10 &&    target_num < 100 ) {
            total_digit += (target_num - 10 + 1) * 2;
            target_num  -= ( target_num - 10 + 1 );
        }
        if ( target_num >= 1 &&    target_num < 10 ) {
            total_digit += (target_num - 1 + 1) * 1;
        }

        sb.append ( total_digit + "\n");
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }    
}
