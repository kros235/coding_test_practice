package sort;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_11651_re {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int amount = Integer.parseInt( br.readLine() );

        int [][] coordinate_list = new int[amount][2];

        StringTokenizer st;
        for ( int i = 0 ; i < amount ; i++ ){
            st = new StringTokenizer( br.readLine() );
            coordinate_list[i][0]   =   Integer.parseInt( st.nextToken() );
            coordinate_list[i][1]   =   Integer.parseInt( st.nextToken() );
        }

        Arrays.sort(coordinate_list , (e1, e2) -> {
            if (e1[1] == e2[1]){
                return e1[0] - e2[0];
            }
            else
                return e1[1] - e2[1];
        });

        StringBuilder sb = new StringBuilder();
        for ( int i = 0 ; i < amount ; i++)
            sb.append(coordinate_list[i][0] + " " + coordinate_list[i][1] + "\n");
        bw.write( String.valueOf(sb) );
        bw.flush();
        br.close();
        bw.close();
    }
}
