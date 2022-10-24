package sort;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Q_2587 {

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int[] list  = new int[5];
        int average = 0;
        for ( int i = 0; i < 5 ; i++){
            list[i] =   Integer.parseInt( br.readLine() );
            average +=  list[i];
        }

        average /=  5;
        Arrays.sort( list );

        bw.write(String.valueOf( average ) + "\n" + String.valueOf( list [2] ) );

        bw.flush();
        br.close();
        bw.close();
    }
}
