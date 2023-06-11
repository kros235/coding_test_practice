package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_17504 {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int round   =   Integer.parseInt( br.readLine() );
        int[] numbers   =   new int[round];

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        for ( int i = 0 ; i < round ; i++ )
            numbers[i]  =   Integer.parseInt( st.nextToken() );

        long numerator = 0, denominator = 0;
        String result   =   "";
        for ( int i = round-2 ; i >= 0 ; i-- ){
            if ( i == round-2 )
                result   =   add_fratction( numbers[i], 1, numbers[i+1] );
            else{
                st  =   new StringTokenizer( result );
                numerator    =   Long.parseLong( st.nextToken() );
                denominator  =   Long.parseLong( st.nextToken() );
                result   =   add_fratction( numbers[i], numerator, denominator );

            }
        }

        st  =   new StringTokenizer( result );
        numerator    =   Long.parseLong( st.nextToken() );
        denominator  =   Long.parseLong( st.nextToken() );


        sb.append ( (denominator-numerator) + " " + denominator );
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

    private static String add_fratction( long num, long numerator, long denominator ) {

        long temp    =   ( num * denominator ) + numerator;
        //String  simplified_fraction_result  =   simplification ( temp, denominator );

        //StringTokenizer st  =   new StringTokenizer( simplified_fraction_result );
        //numerator       =   Long.parseLong( st.nextToken() );
        //denominator     =   Long.parseLong( st.nextToken() );

        numerator       =   temp;


        return denominator + " " + numerator;
    }

    private static String simplification(long temp, long denominator) {

        long min;
        if ( temp < denominator )
            min =    temp;
        else
            min =   denominator;

        long divider    =   1;
        while ( true ) {

            boolean dividable   =   false;
            for (int i = 2; i <= min ; i++ ){
                if ( ( temp % i == 0 ) && ( denominator % i == 0 ) ){
                    divider *=i;
                    dividable = true;
                    break;
                }
            }
            if ( dividable == false )
                break;
        }

        temp /= divider;
        denominator /= divider;
        return temp + " " + denominator;
    }
}
