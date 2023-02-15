package etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_2920 {

    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[] codes = new int[8];
        int result_value    =   0;

        // =========================
        // input
        // =========================
        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        for ( int i = 0 ; i < 8 ; i++ )
            codes[i]    =   Integer.parseInt( st.nextToken() );

        // =========================
        // logic
        // =========================
        if ( codes[0] == 1 ){
            result_value = 1;
            for (int i = 1 ; i <= 8 ; i++)
                if ( codes[i-1] != i )
                    result_value = 0;
        }

        else if ( codes[0] == 8 ){
            result_value = -1;
            for (int i = 8 ; i >= 1 ; i--)
                if ( codes[ codes.length - i ] != i )
                    result_value = 0;
        }
        else
            result_value = 0;

        // =========================
        // print
        // =========================
        switch ( result_value ){
            case 1:{
                sb.append ("ascending\n");
                break;
            }
            case -1:{
                sb.append ("descending\n");
                break;
            }
            default:{
                sb.append ("mixed\n");
                break;
            }
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }
}
