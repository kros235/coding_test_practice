package etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_18110 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int evaluations =   Integer.parseInt ( br.readLine() );
        int subtraction = (int) Math.round( (evaluations * 0.15) );

        int[] eval      =   new int[ evaluations ];
        for ( int i = 0 ; i < evaluations ; i++ )
            eval[i] =   Integer.parseInt( br.readLine() );
        Arrays.sort ( eval );

        double sum  =   0;
        for ( int i = subtraction ; i < evaluations - subtraction ; i++ )
            sum     +=  eval[i];

        double average  =   sum /   (evaluations - subtraction * 2);

        sb.append( (int)Math.round(average) + "\n");
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

   
}
