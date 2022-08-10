package loop;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Q_15552 {
    public static void main(String args[]) throws IOException {
        int round = 0;
        String input;
        int temp_1, temp_2;
        ArrayList<Integer> digits = new ArrayList<>();


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        input = br.readLine();
        round = Integer.parseInt(input);


        if( round > 1000000) {}
        else {

            for (int i = 0; i < round; i++) {
                input = br.readLine();

                String[] array = input.split(" ");
                digits.add( Integer.parseInt( array[0] ) );
                digits.add( Integer.parseInt( array[1] ) );
            }

            for (int i = 0; i < digits.size(); i+=2) {
                temp_1 = digits.get(i);
                temp_2 = digits.get(i+1);

                bw.write(String.valueOf( (temp_1 + temp_2) ) );
                bw.newLine();
            }

            bw.flush();
            bw.close();
        }
    }
}
