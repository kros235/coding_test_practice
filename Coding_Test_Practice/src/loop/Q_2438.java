package loop;

import java.io.*;
import java.util.Scanner;

public class Q_2438 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int round = Integer.parseInt(input);

        if(round < 1 || round > 100){}
        else{
            for(int i = 1 ; i<= round ; i++){
                for (int j = 0; j< i ; j++){
                    bw.write("*");
                }
                bw.newLine();
            }
            bw.flush();
            bw.close();
        }
    }
}
