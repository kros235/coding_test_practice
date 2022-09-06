package string;

import java.io.*;

public class Q_11720 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        int sum = 0, digit_count;

        input = br.readLine();
        digit_count = Integer.parseInt(input);

        input = br.readLine();

        for( int i = 0; i < digit_count ; i++ )
            sum += Integer.parseInt( String.valueOf( input.charAt(i) ) );


        bw.write( String.valueOf(sum) );
        bw.flush();
        br.close();
        bw.close();
    }

}
