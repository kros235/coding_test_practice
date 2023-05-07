package etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_2960 {

    public static int find_min( int[] numbers ){

        for (int i = 0; i < numbers.length; i++) {
            if ( numbers[i] != 0 )
                return i;
        }
        return -1;
    }

    public static int get_eliminated_number(int amount, int target) {
        int[] numbers = new int[amount];
        int count = 0;
        Arrays.fill(numbers, 1);
        numbers[0] = 0;

        while ( true ){

            int min =   find_min( numbers ) + 1;
            for (int i = min ; i <= numbers.length; i+=min) {

                if(  i <= numbers.length && numbers[i-1]!= 0){
                    numbers[i-1]    =   0;
                    count++;
                }
                if ( count == target )
                    return i ;
            }
        }
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int amount = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        sb.append(get_eliminated_number(amount, target));
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
