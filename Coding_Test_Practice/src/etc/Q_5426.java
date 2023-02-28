package etc;

import java.io.*;

public class Q_5426 {

    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        int amount  =   Integer.parseInt( br.readLine() );
        for ( int i = 0 ; i < amount ; i++ ){
            String message     =    br.readLine();
            int square_line    = (int) Math.sqrt( message.length() );

            String[][] array      =    new String[ square_line ][ square_line ];
            int count          =   0;

            // input, encrypted message
            for ( int j = 0 ; j < square_line ; j++ )
                for ( int k = 0 ; k < square_line ; k++ )
                    array[j][k] =   String.valueOf( message.charAt( count++ ) );

            // read, decrypted message
            for ( int j = square_line-1 ; j >= 0 ; j-- )
                for ( int k = 0 ; k < square_line ; k++ )
                    sb.append( array[k][j] );
            sb.append( "\n" );

        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
