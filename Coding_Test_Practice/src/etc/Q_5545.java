package etc;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q_5545 {


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int toppings      =   Integer.parseInt( br.readLine() );

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int dough_price     =   Integer.parseInt( st.nextToken() );
        int topping_price   =   Integer.parseInt( st.nextToken() );

        int dough_kcal      =   Integer.parseInt( br.readLine() );

        ArrayList<Integer> topping_kcal    =   new ArrayList<>();
        for ( int i = 0 ; i < toppings ; i++ )
            topping_kcal.add( Integer.parseInt( br.readLine() ) );

        Collections.sort ( topping_kcal, Collections.reverseOrder() );


        long max_proficiency = -1;

        for ( int i = 0 ; i <= toppings ; i++ ){
            long kcal_sum        =   dough_kcal;

            for ( int j = 0 ; j < i ; j++ )
                kcal_sum += topping_kcal.get(j);

            long kcal_per_won    = (int) (kcal_sum / (double)( dough_price + topping_price * i ) );
            if ( kcal_per_won > max_proficiency )
                max_proficiency =   kcal_per_won;
        }

        sb.append( max_proficiency );
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
