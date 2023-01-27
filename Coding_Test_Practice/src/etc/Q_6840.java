package etc;

import java.io.*;
import java.util.Arrays;

public class Q_6840 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb    =   new StringBuilder();
        int[] bears =   new int[3];

        for ( int i = 0 ; i < 3 ; i++ )
            bears[i]    =   Integer.parseInt( br.readLine() );

        Arrays.sort( bears );

        sb.append( bears[1] + "\n");
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
