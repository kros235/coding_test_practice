package set_and_map;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q_11478 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String input    =    br.readLine();
        HashMap<String, Integer>    partial_String  =   new HashMap<>();

        for ( int i = 1 ; i <= input.length() ; i++ ){
            for ( int j = 0 ; (j + i) <= input.length() ; j++ )
                partial_String.put( input.substring(j, j+i), 1);
        }
        sb.append( partial_String.size() + "\n");

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
