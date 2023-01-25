package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.HashMap;

public class Q_1259 {

    public static String get_reverse_string (String input){
        String result = "";

        for ( int i = input.length()-1 ; i >= 0 ; i--)
            result += input.charAt(i);

        return result;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb    =   new StringBuilder();

        while (true){

            String input    =   br.readLine();

            if ( input.equals("0") == true)
                break;

            else {
                String reverse_input = get_reverse_string(input);
                if (input.equals(reverse_input) == true)
                    sb.append("yes\n");
                else
                    sb.append("no\n");
            }
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }
}
