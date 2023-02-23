package divisor_multiple_and_prime_numbers;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Q_9020 {
    static boolean[] table_list;

    public static void check_prime_numbers(int max_range){

        table_list[0] = false;
        table_list[1] = false;

        // ������ ��
        for ( int i = 2 ; i < Math.sqrt(max_range * 2) ; i ++ ){
            // �������� ��
            for (int j = i ; j <= max_range ; j++){
                if( j % i == 0 && i!=j)
                    table_list[j] = false;
            }
        }
    }

    public static String get_goldbach_partition(int digit){

        if ( digit  % 2 == 0 && table_list[digit/2] == true)
            return (digit/2) + " " + (digit/2);

        else{
            int gap = 10000;
            String result = "";

            // find max_prime
            for (int i = digit-1 ; i > 1 ; i -- ) {
                if (table_list[i] == true && table_list[(digit - i)] == true
                        && gap > Math.abs( i - (digit-i))) {
                    result = (digit - i) + " " + i;
                    gap = Math.abs( i - (digit-i));
                }
            }
            return result;
        }
    }



    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> inputs = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();

        int rounds    =   Integer.parseInt( br.readLine() );

        int max = -999;
        for ( int i = 0 ; i < rounds ; i++ ){
            int digit = Integer.parseInt( br.readLine() );

            if( digit < 4 || digit > 10000 ){}
            else{
                if( max < digit)
                    max = digit;
                inputs.add(digit);
            }
        }

        // make prime number table
        table_list = new boolean[max+1];
        Arrays.fill(table_list, true);
        check_prime_numbers(max);

        for ( int i = 0 ; i < inputs.size() ; i++ )
            results.add( get_goldbach_partition( inputs.get(i) ) );


        for ( int i = 0 ; i < results.size() ; i++ )
            bw.write(results.get(i) + "\n");

        bw.flush();
        br.close();
        bw.close();

    }
}
