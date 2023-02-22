package advanced_1;

import java.io.*;

public class Q_10988 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String input    =   br.readLine();
        String reversed = "";

        for ( int i = input.length()-1 ; i >= 0 ; i-- )
            reversed    +=  String.valueOf( input.charAt(i) );

        if ( input.equals( reversed ) == true )
            sb.append( "1\n");
        else
            sb.append( "0\n");
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
