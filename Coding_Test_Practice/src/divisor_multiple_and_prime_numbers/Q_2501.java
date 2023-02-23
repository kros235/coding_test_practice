package divisor_multiple_and_prime_numbers;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_2501 {

    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> divisors =   new ArrayList<>();

        StringTokenizer st = new StringTokenizer( br.readLine() );
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for ( int i = 1 ; i <= a ; i++){
            if ( a % i == 0 )
                divisors.add ( i );
        }

        if ( divisors.size() <= (b-1) )
            sb.append("0\n");
        else
            sb.append(divisors.get(b-1) + "\n");
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
