package sort;

import java.io.*;
import java.util.Arrays;

public class Q_1181_re {

    public static int[] sort_list(int[] inputs){
        Arrays.sort(inputs);
        return inputs;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int rounds      =   Integer.parseInt( br.readLine() );

        if( rounds < 1 || rounds > 10000000){}
        else {
            int[] inputs = new int[rounds];

            for (int i = 0; i < inputs.length; i++) {
                int temp = Integer.parseInt(br.readLine());
                if (temp < 1 || temp > 10000){}
                else
                    inputs[i] = temp;
            }

            inputs = sort_list(inputs);

            for (int i = 0; i < inputs.length; i++)
                bw.write(inputs[i] + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
