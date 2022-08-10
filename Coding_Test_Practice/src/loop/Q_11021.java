package loop;

import java.io.*;
import java.util.ArrayList;

public class Q_11021 {
    public static void main(String args[]) throws IOException {

        int round = 0 ;
        String input;
        ArrayList<Integer> digits = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        input = br.readLine();
        round = Integer.parseInt(input);

        for(int i = 0; i < round; i++){
            input = br.readLine();
            String[] array = input.split(" ");

            if(Integer.parseInt(array[0]) < 0 || Integer.parseInt(array[1]) > 10){
            }
            else{
                digits.add( Integer.parseInt( array[0] ) );
                digits.add( Integer.parseInt( array[1] ) );
            }
        }

        int counter = 1;
        for( int i = 0; i< digits.size(); i+=2){

            bw.write("Case #" + counter++ + ": ");
            bw.write( String.valueOf( digits.get(i) + digits.get(i+1) ) );
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
