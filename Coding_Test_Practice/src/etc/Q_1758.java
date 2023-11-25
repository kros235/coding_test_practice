package etc;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q_1758 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        int ppl_count           =   Integer.parseInt ( br.readLine() );
        ArrayList<Integer> ppl  =     new ArrayList<>();

        for ( int i = 0 ; i < ppl_count ; i++ )
            ppl.add( Integer.parseInt ( br.readLine() ) );

        Collections.sort ( ppl, Collections.reverseOrder() );

        long tip           =    0;
        for ( int i = 1 ; i <= ppl_count ; i++ ) {
            if ( ppl.get(i-1) - (i - 1) < 0)
                continue;
            else
                tip += ppl.get(i-1) - (i - 1);
        }

        sb.append ( tip + "\n" );

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
