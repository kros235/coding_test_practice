package greedy_algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Q_11047 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int amount          =   Integer.parseInt( st.nextToken() );
        int money           =   Integer.parseInt( st.nextToken() );

        int[] coins         =   new int[ amount ];
        for ( int i = 0 ; i < amount ; i++ )
            coins[i]    =   Integer.parseInt( br.readLine() );

        int result      =   greedy_coins( money, coins );

        bw.write( result + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

    private static int greedy_coins(int money, int[] coins) {
        int counter =   0 ;
        int index   =   coins.length - 1;
        while (true){
            if ( money == 0 )
                break;
            else if ( money < coins[index] )
                index--;
            else {
                money -= coins[index];
                counter++;
            }
        }

        return counter;

    }
}
