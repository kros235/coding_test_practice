package one_dimension_array;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Q_8958 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String score_list_amount = br.readLine();
        int continuous_counter, point_sum;

        for(int i = 0 ; i < Integer.parseInt(score_list_amount) ; i++){
            point_sum = 0;
            String result = br.readLine();
            if(result.length() < 0 || result.length() > 80){}
            else{
                continuous_counter = 1;
                for(int j = 0 ; j < result.length();j++){

                    if( String.valueOf(result.charAt(j)) . equals("O")  ){
                        point_sum += continuous_counter;
                        continuous_counter++;
                    }
                    else{
                        continuous_counter = 1;
                    }
                }
                bw.write( String.valueOf(point_sum) + "\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
