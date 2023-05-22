package etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_7595 {



    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true ) {
            int round   =   Integer.parseInt( br.readLine() );

            if( round != 0 ){

                for ( int i = 1 ; i <= round ; i++ ){
                    for ( int j = 0 ; j < i ; j++ )
                        sb.append("*");
                    sb.append("\n");
                }
            }
            else
                break;
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
