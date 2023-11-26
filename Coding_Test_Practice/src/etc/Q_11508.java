package etc;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Q_11508 {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        int item_count           =   Integer.parseInt ( br.readLine() );
        ArrayList<Integer> price  =     new ArrayList<>();

        for ( int i = 0 ; i < item_count ; i++ )
            price.add( Integer.parseInt ( br.readLine() ) );

        Collections.sort ( price, Collections.reverseOrder() );

        long pay_amount     =    0;
        int index = 0;
        for ( int i = 0 ; i < (item_count / 3) * 3 ; i+=3 ) {
            pay_amount += price.get(i) + price.get(i + 1);
            index   =   i + 2;
        }

        for ( int i = index + 1 ; i < item_count ; i++ ) {
            pay_amount += price.get(i);
        }

        sb.append ( pay_amount + "\n" );

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
