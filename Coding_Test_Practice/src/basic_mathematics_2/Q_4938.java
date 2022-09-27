package basic_mathematics_2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Q_4938 {
    static boolean[] table_list;

    public static void check_prime_numbers(int max_range){

        table_list[0] = false;
        table_list[1] = false;

        // 나누는 수
        for ( int i = 2 ; i < Math.sqrt(max_range * 2) ; i ++ ){
            // 나눠지는 수
            for (int j = i ; j <= max_range ; j++){
                if( j % i == 0 && i!=j)
                    table_list[j] = false;
            }
        }
    }

    public static int count_prime_numbers_in_range(int min_range){
        int count = 0;
        int max_range = min_range * 2;

        for ( int i = min_range+1 ; i <= max_range ; i++)
            if (table_list[i] == true)
                count++;
        return count;
    }



    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> inputs   =   new ArrayList<>();
        ArrayList<Integer> results  =   new ArrayList<>();

        int max = -9999;
        while (true){
            String input    =   br.readLine();
            int input_range =   Integer.parseInt(input);

            if( input_range == 0 )
                break;
            else if( input_range < 1 || input_range > 123456 )
                continue;
            else {
                if( input_range > max )
                    max = input_range;
                inputs.add(input_range);
            }
        }

        table_list = new boolean[(max*2)+1];
        Arrays.fill(table_list, true);
        check_prime_numbers(max*2);


        for ( int i = 0 ; i < inputs.size() ; i++ )
            results.add ( count_prime_numbers_in_range( inputs.get(i) ) );

        for ( int i = 0 ; i < results.size() ; i++ )
            bw.write(String.valueOf( results.get(i) ) + "\n");

        bw.flush();
        br.close();
        bw.close();

    }
}
