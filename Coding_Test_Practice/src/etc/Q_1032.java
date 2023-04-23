package etc;

import java.io.*;

public class Q_1032 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int round   =   Integer.parseInt( br.readLine() );
        String[]  inputs  =   new String[round];

        for ( int i = 0 ; i < round ; i++ )
            inputs[i]   =   br.readLine();

        int input_length    =   inputs[0].length();
        for ( int i = 0 ; i < input_length ; i++ ){
            char letter =   inputs[0].charAt(i);

            boolean equality_checker    =   true;
            for ( int j = 1 ; j < round ; j++ ){
                if ( String.valueOf( inputs[j].charAt(i) ).equals( String.valueOf( letter ) )  == false ) {
                    sb.append("?");
                    equality_checker = false;
                    break;
                }
            }
            if ( equality_checker == true )
                sb.append( letter );
        }

        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
