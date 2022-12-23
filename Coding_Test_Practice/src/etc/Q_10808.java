package etc;

import java.io.*;
import java.util.Arrays;

public class Q_10808 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        String input    =   br.readLine();
        int[] alphabet =   new int[26];
        Arrays.fill( alphabet, 0);

        for ( int i = 0 ; i < input.length() ; i++ )
            alphabet[ ( input.charAt(i) - 97) ] ++;

        for ( int i = 0 ; i < alphabet.length ; i++ )
            sb.append( alphabet[i] + " ");

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
