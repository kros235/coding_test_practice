package recursive;

import java.io.*;

public class Q_10872 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input    =   br.readLine();
        int digit       =   Integer.parseInt(input);
        int result      =   1;


        if ( digit < 0 ||  digit > 12){}
        else {
            for ( int i  = 1 ; i <= digit ; i++)
                result *= i;
            bw.write( String.valueOf( result ) );
        }
        bw.flush();
        br.close();
        bw.close();

    }

}
