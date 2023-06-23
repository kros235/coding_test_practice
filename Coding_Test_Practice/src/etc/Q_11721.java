package etc;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q_11721 {



    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String input    =   br.readLine();

        for ( int i = 0 ; i < input.length() ; i++ ){
            if ( (i+1) % 10 != 0 || i == 0)
                sb.append( input.charAt(i) );
            else
                sb.append( input.charAt(i) + "\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
