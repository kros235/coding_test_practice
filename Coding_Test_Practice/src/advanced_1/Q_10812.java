package advanced_1;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q_10812 {


    public static int[] shuffle ( int[] basket, int begin, int end, int mid ){

        ArrayList<Integer> before_begin =   new ArrayList<>();

        // begin ~ mid - 1
        ArrayList<Integer> begin_range  =   new ArrayList<>();

        // mid ~ end
        ArrayList<Integer> mid_range    =   new ArrayList<>();

        ArrayList<Integer> after_end    =   new ArrayList<>();

        for ( int i = 0 ; i < begin-1 ; i++ )
            before_begin.add ( basket[i] );

        for  ( int i = mid; i<=end ; i++ )
            mid_range.add ( basket[i-1] );

        for  ( int i = begin; i< mid-1 ; i++ )
            begin_range.add ( basket[i-1] );

        after_end.add ( basket[mid-1-1] );
        for ( int i = end+1 ; i <= basket.length ; i++ )
            after_end.add ( basket[i-1] );

        ArrayList<Integer> merged   =   new ArrayList<>();
        merged.addAll( before_begin);
        merged.addAll( mid_range);
        merged.addAll( begin_range);
        merged.addAll( after_end);

        int[] result = new int[merged.size()];
        for ( int i = 0 ; i< merged.size() ; i++ )
            result[i]   =   merged.get(i);

        return result;
    }


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int size, shuffle_round;
        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        size                =   Integer.parseInt( st.nextToken() );
        shuffle_round       =   Integer.parseInt( st.nextToken() );

        int[]   baskets     =   new int[size];
        for ( int i = 1 ; i <= size ; i++ )
            baskets[i-1]    =   i;


        // logic
        for ( int i = 0 ; i < shuffle_round ; i++ ){
            st          =   new StringTokenizer( br.readLine() );
            int begin   =   Integer.parseInt( st.nextToken() );
            int end     =   Integer.parseInt( st.nextToken() );
            int mid     =   Integer.parseInt( st.nextToken() );

            if ( begin != mid)
                baskets     =   shuffle ( baskets, begin, end, mid );
        }

        // print
        for ( int i = 0 ; i < baskets.length ; i++ )
            sb.append( baskets[i] + " ");
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
