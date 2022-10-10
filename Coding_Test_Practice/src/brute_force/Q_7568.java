package brute_force;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Q_7568 {

    static ArrayList<Integer> weight_list  =   new ArrayList<>();
    static ArrayList<Integer> height_list  =   new ArrayList<>();

    public static int get_rank(int amount, int weight, int height) {

        int count = 1;
        for (int i = 0 ; i < amount ; i++)
            if ( weight_list.get(i) > weight && height_list.get(i) > height )
                count ++;
        return count;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int amount = Integer.parseInt(br.readLine());

        ArrayList<Integer> rank_list    =   new ArrayList<>();

        if (amount < 2 || amount > 50){
        } else {

            for (int i = 0 ; i < amount ; i++) {
                String[] input = br.readLine().split(" ");
                int weight = Integer.parseInt( input[0] );
                int height = Integer.parseInt( input[1] );

                if ( weight < 10 || weight > 200
                        || height < 10 || height > 200){}
                else {
                    weight_list.add( weight );
                    height_list.add( height );
                }
            }


            for (int i = 0 ; i < amount ; i++)
                rank_list.add( get_rank ( amount, weight_list.get(i), height_list.get(i) ) );

            for (int i = 0 ; i < amount ; i++)
                bw.write(String.valueOf( rank_list.get(i) ) + " ");

        }
        bw.flush();
        br.close();
        bw.close();
    }
}