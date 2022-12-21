package etc;

import java.io.*;
import java.util.Arrays;

public class Q_5543 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringBuilder sb = new StringBuilder();

        int[] burgers = new int[3];
        int[] beverages = new int[2];

        for ( int i = 0 ; i < 3 ; i++ )
            burgers[i] = Integer.parseInt( br.readLine() );

        for ( int i = 0 ; i < 2 ; i++ )
            beverages[i] = Integer.parseInt( br.readLine() );

        Arrays.sort( burgers );
        Arrays.sort( beverages );

        sb.append( (burgers[0] + beverages[0] - 50 ) );
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
