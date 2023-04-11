package divisor_multiple_and_prime_numbers_2;

import java.io.*;
import java.util.StringTokenizer;

public class Q_1735 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[][] fractions = new int[2][2];
        for ( int i = 0 ; i < 2 ; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            fractions[i][0] = Integer.parseInt( st.nextToken() );
            fractions[i][1] = Integer.parseInt( st.nextToken() );
        }

        int LCM  =   get_least_common_multiple ( fractions[0][1] , fractions[1][1] ) ;

        int fraction_1_multiplier   =   LCM / fractions[0][1];
        int fraction_2_multiplier   =   LCM / fractions[1][1];

        int topper_sum              =   fractions[0][0] * fraction_1_multiplier
                +   fractions[1][0] * fraction_2_multiplier;

        int GCM =   get_greatest_common_measure ( topper_sum, LCM );

        sb.append( ( topper_sum / GCM ) + " " + ( LCM / GCM ) );
        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();

    }

    private static int get_greatest_common_measure(int topper_sum, int LCM) {
        int result = 1;

        while ( true ) {
            int smaller_one;
            if ( topper_sum < LCM )
                smaller_one =   topper_sum;
            else
                smaller_one =   LCM;

            boolean dividable   =   false;
            for ( int i = 2 ; i <= smaller_one ; i++){
                if ( ( topper_sum % i == 0 ) && ( LCM % i == 0 ) ){
                    result *= i;
                    topper_sum /= i;
                    LCM /= i;
                    dividable   =   true;
                    break;
                }
            }
            if ( dividable == false)
                break;
            else
                continue;
        }
        return result;
    }

    private static int get_least_common_multiple(int base_1, int base_2) {

        int result = 1;
        while ( true ) {
            int smaller_one;
            if ( base_1 < base_2 )
                smaller_one =   base_1;
            else
                smaller_one =   base_2;

            boolean dividable   =   false;
            for ( int i = 2 ; i <= smaller_one ; i++){
                if ( ( base_1 % i == 0 ) && ( base_2 % i == 0 ) ){
                    result *= i;
                    base_1 /= i;
                    base_2 /= i;
                    dividable   =   true;
                    break;
                }
            }
            if ( dividable == false)
                break;
            else
                continue;
        }
        return ( result * base_1 * base_2 );
    }
}
