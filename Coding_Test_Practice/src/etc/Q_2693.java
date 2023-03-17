package etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_2693 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int round   =   Integer.parseInt ( br.readLine() );
        int[] array =   new int[10];


        for( int i = 0 ; i < round ; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for( int j = 0 ; j < 10 ; j++ )
                array[j]    =   Integer.parseInt( st.nextToken() );
            Arrays.sort ( array );
            sb.append( array [ array.length - 3 ] + "\n");
        }

        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

}
