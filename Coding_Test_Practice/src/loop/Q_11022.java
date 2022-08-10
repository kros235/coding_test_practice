package loop;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Q_11022 {
    public static void main(String args[]) throws IOException {
        int round;
        String input;
        ArrayList<Integer> digits = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        input = br.readLine();
        round = Integer.parseInt(input);

        for( int i = 0 ; i < round ; i++){
            input = br.readLine();
            String[] numbers = input.split(" ");
            if(Integer.parseInt(numbers[0]) < 0 || Integer.parseInt(numbers[0]) > 10
                    || Integer.parseInt(numbers[1]) < 0 || Integer.parseInt(numbers[1]) > 10) continue;
            else{
                digits.add(Integer.parseInt(numbers[0]));
                digits.add(Integer.parseInt(numbers[1]));
            }
        }

        int counter = 1;
        for(int i = 0 ; i<digits.size(); i+=2){
            bw.write("Case #" + counter++ + ": " + digits.get(i) + " + " + digits.get(i+1)
                    + " = " + (digits.get(i) +  digits.get(i+1)) );
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
