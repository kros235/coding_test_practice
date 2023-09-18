package etc;

import java.io.*;
import java.util.*;

public class Q_10867 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int num_amount = Integer.parseInt(br.readLine());

        HashMap<Integer, Boolean> numbers   =   new HashMap<Integer, Boolean>();

        StringTokenizer st  =   new StringTokenizer( br.readLine());
        for (int i = 0; i < num_amount; i++)
            numbers.put( Integer.parseInt( st.nextToken() ), false );


        int[] sort_numbers  =   new int[ numbers.size() ];
        int index   =   0;
        for (Map.Entry<Integer, Boolean> map : numbers.entrySet() ){
            sort_numbers[index++]   =   map.getKey();
        }
        Arrays.sort ( sort_numbers );

        for (int i = 0; i < sort_numbers.length; i++)
            sb.append(sort_numbers[i] + " ");
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

}
