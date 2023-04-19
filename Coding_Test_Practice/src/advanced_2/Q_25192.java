package advanced_2;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q_25192 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        HashMap<String, Integer> list   =   new HashMap<>();
        int round           =   Integer.parseInt( br.readLine() );
        int greetings       =   0;

        for( int i = 0 ; i < round ; i++ ){
            String input    =   br.readLine();
            if ( input.equals("ENTER") == true )
                list.clear();
            else{
                if ( list.containsKey(input) == false) {
                    list.put(input, 1);
                    greetings++;
                }
                else
                    continue;
            }
        }

        sb.append( greetings );
        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

}
