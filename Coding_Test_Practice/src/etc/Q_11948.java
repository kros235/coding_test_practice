package etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_11948 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[] science   = new int[4];
        int[] society   = new int[2];

        for ( int i = 0 ; i < 6 ; i++ ) {
            if ( i < 4)
                science[i]  =   Integer.parseInt( br.readLine() );
            else
                society[i-4]    =   Integer.parseInt( br.readLine() );
        }

        Arrays.sort ( science );
        Arrays.sort ( society );

        int sum =   science[3] + science[2] + science[1] + society[1];
        sb.append ( sum + "\n");
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
