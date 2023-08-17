package stack_queue_and_deque;

import java.io.*;
import java.util.Stack;

public class Q_10773 {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> money_pot   =   new Stack<>();
        int amount_of_call = Integer.parseInt(br.readLine());


        for (int i = 0; i < amount_of_call; i++) {
            String num =   br.readLine();
            switch ( num ){
                case "0":{
                    money_pot.pop();
                    break;
                }
                default:{
                    money_pot.push( Integer.parseInt( num ) );
                    break;
                }
            }
        }

        int sum = 0;
        while( money_pot.isEmpty() != true )
            sum += money_pot.pop();

        bw.write(sum + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
