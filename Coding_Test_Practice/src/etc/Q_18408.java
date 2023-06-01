package etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_18408 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[] count =   new int[2];
        Arrays.fill( count , 0);

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        for ( int i = 0 ; i < 3 ; i++ ){
            int num =   Integer.parseInt( st.nextToken() );
            if ( num == 1 )
                count[0] ++;
            else
                count[1] ++;
        }

        if ( count[0] > count[1] )
            sb.append ( "1\n");
        else
            sb.append ( "2\n");
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
