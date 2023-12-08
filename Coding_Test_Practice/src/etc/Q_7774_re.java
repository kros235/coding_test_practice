package etc;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q_7774_re {

    public static ArrayList<Integer> a_to_b   =   new ArrayList<>();
    public static ArrayList<Integer> b_to_a   =   new ArrayList<>();

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int a_to_b_count    =   Integer.parseInt( st.nextToken() );
        int b_to_a_count    =   Integer.parseInt( st.nextToken() );

        st  =   new StringTokenizer( br.readLine() );
        for ( int i = 0 ; i < a_to_b_count ; i++ )
            a_to_b.add( Integer.parseInt( st.nextToken() ));

        st  =   new StringTokenizer( br.readLine() );
        for ( int i = 0 ; i < b_to_a_count ; i++ )
            b_to_a.add( Integer.parseInt( st.nextToken() ));

        Collections.sort ( a_to_b , Collections.reverseOrder() );
        Collections.sort ( b_to_a , Collections.reverseOrder() );

        int a_available = 1;   //  A형 콘센트 수
        int b_available = 0;   //  B형 콘센트 수

        int res = 0;            //   결과

        while ( true ){

            int flag    =   0;

            if (b_available > 0 && !b_to_a.isEmpty() ){
                b_available --;
                a_available += b_to_a.get(0);
                b_to_a.remove(0);
                flag = 1;

            }
            else if ( a_available > 0 && !a_to_b.isEmpty() ){
                a_available --;
                b_available += a_to_b.get(0);
                a_to_b.remove(0);
                flag = 1;
            }

            if (flag == 0)
                break;
            res =   max( a_available, res );
        }

        sb.append( res );
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

    private static int max(int resa, int res) {
        if ( resa > res )
            return resa;
        else
            return  res;
    }

}
