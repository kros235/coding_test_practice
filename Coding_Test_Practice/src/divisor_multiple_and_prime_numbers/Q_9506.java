package divisor_multiple_and_prime_numbers;

import java.io.*;
import java.util.ArrayList;

public class Q_9506 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> divisors =   new ArrayList<>();

        while ( true ) {
            int a = Integer.parseInt( br.readLine() );
            int sum = 0;
            divisors.clear();

            if ( a != -1) {

                for (int i = 1; i <= a; i++) {
                    if ((a % i == 0) && (a != i)) {
                        divisors.add(i);
                        sum += i;
                    }
                }

                if (a == sum) {
                    sb.append(a + " = ");
                    for (int j = 0; j < divisors.size(); j++) {
                        sb.append(divisors.get(j));
                        if (j != divisors.size() - 1) {
                            sb.append(" + ");
                        }
                    }
                    sb.append("\n");
                } else
                    sb.append(a + " is NOT perfect.\n");
            }
            else
                break;
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
