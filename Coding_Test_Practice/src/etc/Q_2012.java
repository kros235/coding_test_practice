package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Q_2012 {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int ppl                 =   Integer.parseInt( br.readLine() );
        ArrayList<Integer> rank =   new ArrayList<>();

        for ( int m = 0 ; m < ppl ; m++ )
            rank.add( Integer.parseInt( br.readLine() ) );

        Collections.sort ( rank );

        long sum =   0;
        for ( int m = 1 ; m <= ppl ; m++ )
            sum +=  Math.abs( m - rank.get( m-1 ) );

        sb.append( sum + "\n" );
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

}
