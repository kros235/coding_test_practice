package etc;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q_17254 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();



        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int keyboard_count  =   Integer.parseInt( st.nextToken() );
        int press_event      =   Integer.parseInt( st.nextToken() );

        Comparator<keyboard> myComparator   =   new Comparator<keyboard>() {
            @Override
            public int compare(keyboard o1, keyboard o2) {
                if ( o1.timing != o2.timing )
                    return o1.timing - o2.timing;
                else {
                    return o1.key_num - o2.key_num;
                }
            }
        };

        keyboard[] keyboards    =   new keyboard[ press_event ];
        for ( int i = 0 ; i < press_event ; i++ ){
            st  =   new StringTokenizer( br.readLine() );
            int temp_key_num     =   Integer.parseInt( st.nextToken() );
            int temp_timing      =   Integer.parseInt( st.nextToken() );
            String temp_letter   =   st.nextToken();

            keyboards[i]    =   new keyboard( temp_key_num, temp_timing, temp_letter );
        }

        Arrays.sort ( keyboards, myComparator );

        for ( int i = 0 ; i < press_event ; i++ )
            sb.append( keyboards[i].letter );
        sb.append("\n");

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();

    }
    public static class keyboard{
        int key_num;
        int timing;
        String letter;

        public keyboard(int key_num, int timing, String letter ) {
            this.key_num   =   key_num;
            this.timing    =   timing;
            this.letter    =   letter;
        }
    }
}
