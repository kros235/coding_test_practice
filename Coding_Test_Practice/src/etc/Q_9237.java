package etc;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q_9237 {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int trees =   Integer.parseInt( br.readLine() );
        Integer[] tree_growth =   new Integer[ trees ];

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        for ( int i = 0 ; i < trees ; i++ )
            tree_growth[i]      =   Integer.parseInt( st.nextToken() );

        Comparator<Integer> myComparator    =   new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };
        Arrays.sort ( tree_growth , myComparator );

        for ( int i = 1 ; i <= trees ; i++ )
            tree_growth[i-1]    =   (i+1) + tree_growth[i-1];

        Arrays.sort ( tree_growth , myComparator );

        sb.append( tree_growth[0] + "\n");
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}
