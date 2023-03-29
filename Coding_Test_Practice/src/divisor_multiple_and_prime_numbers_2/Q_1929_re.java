package divisor_multiple_and_prime_numbers_2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Q_1929_re {
    static boolean[] prime_checker;

    // �����佺�׳׽��� ü �˰��� ( Sieve of Eratosthenes Algorithm )

    public static void find_prime_numbers(int min_range, int max_range) {

        Arrays.fill(prime_checker, true);

        prime_checker[0] = false;
        prime_checker[1] = false;

        if(min_range > 2) {
            for (int i = 2; i < min_range; i++)
                prime_checker[i] = false;
        }

        // ������ ��
        for ( int i = 2 ; i <= Math.sqrt(max_range) ; i++){

            // �������� ��
            for ( int j = min_range; j < prime_checker.length ; j++){

                if( prime_checker[j]== false){
                    //System.out.println( j + "is already false, skipped");
                    continue;
                }
                else {
                    if (j % i == 0 && i != j) {
                        prime_checker[j] = false;
                        //System.out.println(" j = " + j + " deleted by " + i);
                    } //else
                    //System.out.println(" j = " + j + ", i = " + i);
                }
            }


        }


    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> result = new ArrayList<>();

        String input = br.readLine();
        String[] boundaries = input.split(" ");
        int min_range = Integer.parseInt(boundaries[0]);
        int max_range = Integer.parseInt(boundaries[1]);

        prime_checker = new boolean[max_range+1];

        if (min_range < 1 || min_range > 1000000
                || max_range < 1 || max_range > 1000000
                || max_range < min_range) {
        } else {

            find_prime_numbers(min_range, max_range);

            for (int i = 0; i < prime_checker.length; i++) {
                if( prime_checker[i] != false)
                    bw.write(String.valueOf(i) + "\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();

    }
}
