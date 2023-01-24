package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q_1267 {

    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int calls   =   Integer.parseInt( br.readLine() );

        int[] call_time     =   new int[calls];

        StringBuilder sb = new StringBuilder();
        StringTokenizer st  =   new StringTokenizer( br.readLine() );

        int youngSik_bill = 0, minSik_bill = 0 ;

        for (int i = 0 ; i  < calls ; i++ ) {
            call_time[i] = Integer.parseInt(st.nextToken());



            youngSik_bill += 10 * ( call_time[i] / 30 );
            if ( call_time[i] % 30 >= 0 )
                youngSik_bill += 10;

            minSik_bill += 15 * ( call_time[i] / 60 );
            if ( call_time[i] % 60 >= 0 )
                minSik_bill += 15;



        }

        if ( youngSik_bill < minSik_bill)
            sb.append ( "Y " + youngSik_bill);

        else if ( youngSik_bill > minSik_bill)
            sb.append ( "M " + minSik_bill);
        else
            sb.append ( "Y M " + minSik_bill);

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
