package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_3036 {

    public static int get_gcd(int a, int b){
        int result  =   1;
        int min;
        if ( a < b )
            min =   a;
        else
            min =   b;

        while (true) {
            boolean dividable = false;
            for (int i = 2; i <= min; i++) {
                if ((a % i == 0) && (b % i == 0)) {
                    result *= i;
                    a /= i;
                    b /= i;
                    dividable = true;
                }
            }
            if ( dividable == false )
                break;
        }
        return result;
    }
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int wheel_amount    =   Integer.parseInt( br.readLine() );

        int main_wheel = 1;
        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        for ( int i = 0 ; i < wheel_amount ; i ++ ) {
            if ( i == 0 )
                main_wheel = Integer.parseInt( st.nextToken() );
            else {
                int sub_wheel   =   Integer.parseInt( st.nextToken() );
                int gcd = get_gcd ( main_wheel, sub_wheel );
                sb.append ( ( main_wheel / gcd ) + "/" + ( sub_wheel / gcd ) + "\n" );
            }
        }

        bw.write( String.valueOf(sb) );
        bw.flush();
        br.close();
        bw.close();
    }

}
