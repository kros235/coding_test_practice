package binary_search;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q_2805 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int total_trees          =   Integer.parseInt( st.nextToken() );
        long tree_requirement    =   Long.parseLong( st.nextToken() );

        long[] trees =   new long [ total_trees ];
        long min     =   Long.MAX_VALUE;
        long sum     =   0;
        st  =   new StringTokenizer( br.readLine() );
        for ( int i = 0 ; i < total_trees ; i++ ){
            trees[i]    =    Long.parseLong( st.nextToken() );
            if ( min > trees[i] )
                min =   trees[i];
            sum += trees[i];
        }

        long start_point     =   0;
        long end_point       =   sum;
        long median;

        ArrayList<Long> result   =   new ArrayList<>();
        while ( start_point <= end_point ){
            median          =   ( start_point + end_point ) / 2;

            boolean possibility =   compare( trees, median, tree_requirement );
            if ( possibility == true ){
                start_point =   median + 1;
                result.add ( median );
            }
            else
                end_point   =   median - 1;
        }

        long max =   Long.MIN_VALUE;
        for ( int i = 0 ; i < result.size() ; i++ )
            if ( result.get(i) > max )
                max =   result.get(i);

        sb.append ( max );
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

    private static boolean compare(long[] trees, long median, long tree_requirement) {

        long sum =   0;
        for ( int i = 0 ; i < trees.length ; i++ )
            if ( trees[i] > median )
                sum +=  trees[i] - median;

        if ( sum >= tree_requirement )
            return true;
        else
            return false;
    }


}
