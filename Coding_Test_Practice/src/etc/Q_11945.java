package etc;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q_11945 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  = new StringTokenizer( br.readLine() );
        int round   = Integer.parseInt( st.nextToken() );
        int length  = Integer.parseInt( st.nextToken() );

        for ( int i = 0 ; i < round ; i++ ){
            String input    =   br.readLine();
            for ( int j = length-1 ; j >= 0 ; j-- )
                sb.append ( input.charAt(j) );
            sb.append ("\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
