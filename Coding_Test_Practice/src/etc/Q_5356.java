package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_5356 {



    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb    =   new StringBuilder();


        int rounds  =   Integer.parseInt( br.readLine() );

        for ( int i = 0 ; i < rounds ; i++ ) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int rows       =   Integer.parseInt( st.nextToken() );
            int alphabet   =   Integer.parseInt(  String.valueOf( st.nextToken().charAt(0) - 'A')  ) ;


            for ( int j = 0 ; j < rows ; j++ ) {

                for ( int k = 0 ; k <= j ; k++ ) {
                    sb.append( String.valueOf(  (char)( alphabet + 'A') ) );
                }
                sb.append("\n");

                if( alphabet >= (int)('Z' - 'A') )
                    alphabet =  0;
                else
                    alphabet++;
            }
            sb.append("\n");
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();

    }

}
