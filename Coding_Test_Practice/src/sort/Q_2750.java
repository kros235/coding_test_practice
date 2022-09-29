package sort;

import java.io.*;
import java.util.Arrays;

public class Q_2750 {

    public static int[] sort_list(int[] inputs){

        Arrays.sort(inputs);
        return inputs;

    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int rounds      =   Integer.parseInt( br.readLine() );

        if( rounds < 1 || rounds > 1000){}
        else {
            int[] inputs = new int[rounds];

            for (int i = 0; i < inputs.length; i++)
                inputs[i] = Integer.parseInt(br.readLine());

            inputs = sort_list(inputs);

            for (int i = 0; i < inputs.length; i++)
                bw.write(inputs[i] + "\n");
        }
        bw.flush();
        br.close();
        bw.close();

    }
}
