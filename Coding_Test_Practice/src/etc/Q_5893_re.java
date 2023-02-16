package etc;

import java.io.*;
import java.util.ArrayList;

public class Q_5893_re {

    public static String add( String input, String seventeen) {

        String result   =   "";
        int overcome_value  =   0;

        // ======================
        // short parts
        // ======================
        for ( int i = 0 ; i < input.length() ; i++ ){
            int original            =   Integer.parseInt( String.valueOf( input.charAt( input.length() - i - 1) ) );
            int seventeen_times     =   Integer.parseInt( String.valueOf( seventeen.charAt( seventeen.length() - i - 1) ) );
            int temp    =   original + seventeen_times + overcome_value;

            if ( temp > 1 ) {
                overcome_value = 1;
                if ( temp % 2 == 1)
                    result = "1" + result;
                else
                    result = "0" + result;
            }
            else {
                overcome_value = 0;
                result = temp + result;
            }
        }

        // ======================
        // left-over parts
        // ======================
        for ( int i = input.length() ; i < seventeen.length() ; i++ ) {
            int seventeen_times = Integer.parseInt(String.valueOf(seventeen.charAt(seventeen.length() - i - 1)));
            int temp    =   seventeen_times + overcome_value;

            if ( temp > 1 ) {
                overcome_value = 1;
                if ( temp % 2 == 1)
                    result = "1" + result;
                else
                    result = "0" + result;
            }
            else {
                overcome_value = 0;
                result = temp + result;
            }
        }

        if ( overcome_value == 1)
            result = "1" + result;

        return result;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        String input =   br.readLine() ;
        String sixteen_times    =   input + "0000";

        String result   =   add ( input, sixteen_times);

        sb.append( result + "\n");
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
