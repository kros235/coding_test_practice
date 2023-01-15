package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_2522 {



    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb    =   new StringBuilder();
        StringTokenizer st  =   new StringTokenizer( br.readLine() );

        int rounds      =   Integer.parseInt( st.nextToken() );


        for ( int i = 0 ; i < rounds * 2 - 1 ; i++ ) {

            if ( i < rounds) {
                for (int j = rounds - 2 - i; j >= 0; j--)
                    sb.append(" ");

                for (int k = 0; k <= i; k++)
                    sb.append("*");
            }

            else{

                for (int k = 0; k <= i - rounds; k++)
                    sb.append(" ");


                for (int j = 0 ; j < rounds * 2 - 1 - i ; j++)
                    sb.append("*");

            }
            sb.append( "\n");
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }
}
