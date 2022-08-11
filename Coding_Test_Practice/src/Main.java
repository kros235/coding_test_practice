import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        String[] input_numbers;
        int round, compare_num;
        ArrayList<Integer> digits = new ArrayList<>();

        input = br.readLine();
        input_numbers = input.split(" ");
        round = Integer.parseInt( input_numbers[0] );
        compare_num = Integer.parseInt( input_numbers[1] );





        if(round < 1 || round > 10000
            || compare_num < 1 || compare_num > 10000){}
        else{

            input = br.readLine();

            System.out.println("input = " + input);
            //String[] number_lists = input.split(" ");

/*
            System.out.println("number_lists.length = " + number_lists.length);
            System.out.println("number_lists[0] = " + number_lists[0]);

            for (int i = 0; i < number_lists.length ; i ++)
                if(Integer.parseInt( number_lists[i] ) < compare_num )
                    digits.add( Integer.parseInt( number_lists[i] ) );

            for (int i = 0; i < digits.size() ; i ++){
                bw.write( String.valueOf( digits.get(i) ) );
                if( i!= (digits.size()-1) )
                    bw.write(" ");
            }
            bw.flush();
            bw.close();*/



        }
    }
}