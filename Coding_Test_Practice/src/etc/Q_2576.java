package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Q_2576 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        long odd_sum =   0;
        ArrayList<Long> temp_store  =   new ArrayList<>();
        for ( int i = 0 ; i < 7 ; i++ ){
            long num = Long.parseLong( br.readLine() );

            if ( num % 2 == 1 ) {
                odd_sum += num;
                temp_store.add ( num );
            }
        }

        if ( temp_store.size() != 0 ) {
            sb.append(odd_sum + "\n");


            Object[] odd_values = temp_store.toArray();
            Arrays.sort(odd_values);

            sb.append(odd_values[0] + "\n");
        }
        else
            sb.append("-1\n");
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

}
