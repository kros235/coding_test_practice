package etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_1159 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int player_amount   =   Integer.parseInt( br.readLine() );
        String[] players    =   new String[player_amount];


        for (int i = 0; i < player_amount ; i++)
            players[i]    =   br.readLine();

        Arrays.sort( players );

        String init_word = String.valueOf( players[0].charAt(0) );
        int count = 1;

        for (int i = 1; i < player_amount ; i++){
            if ( init_word.equals( String.valueOf( players[i].charAt(0) ) ) == true )
                count++;
            else {
                init_word = String.valueOf(players[i].charAt(0));
                count   =   1;
            }

            if ( count   ==  5 )
                sb.append ( init_word );
        }

        if ( sb.length() == 0 )
            sb.append ( "PREDAJA" );
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }
}
