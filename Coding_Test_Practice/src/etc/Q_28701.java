package etc;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q_28701 {

    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int round       =   Integer.parseInt( br.readLine() );
        long sum         =   0;
        for ( int m = 1 ; m <= round ; m++ )
            sum += m;

        sb.append( sum + "\n" );
        sb.append( (int)Math.pow(sum, 2) + "\n" );

        sum =   0;
        for ( int m = 1 ; m <= round ; m++ )
            sum += (long)Math.pow(m, 3);
        sb.append( sum + "\n" );

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
