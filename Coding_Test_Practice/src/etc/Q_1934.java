package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_1934 {

    public static int find_least_common_multiple( int a, int b){
        int divider =   1;

        while ( true ){

            boolean dividable_check =   false;
            for ( int i = 2 ; i <= find_larger_num( a, b) ; i++ ){
                if ( (a % i == 0) && (b % i == 0) ){
                    a   /=  i;
                    b   /=  i;
                    divider *= i;
                    dividable_check =   true;
                }
                else
                    continue;
            }
            if ( dividable_check == false )
                break;
        }
        return ( divider * a * b);
    }

    public static int find_larger_num( int a, int b){
        if ( a > b )
            return a;
        else
            return b;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int amount  =   Integer.parseInt( br.readLine() );

        for ( int i = 0 ; i < amount ; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a   =   Integer.parseInt( st.nextToken() );
            int b   =   Integer.parseInt( st.nextToken() );

            sb.append( find_least_common_multiple( a, b) + "\n" );
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
