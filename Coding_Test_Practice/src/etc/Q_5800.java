package etc;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q_5800 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int classes =   Integer.parseInt( br.readLine() );
        int[][] class_score =   new int[ classes ][];
        for ( int i = 0 ; i < classes ; i++ ){
            StringTokenizer st  =   new StringTokenizer( br.readLine() );
            int students        =   Integer.parseInt( st.nextToken() );
            class_score[i]      =   new int[ students ];

            for ( int j = 0 ; j < students ; j++ )
                class_score[i][j]   =   Integer.parseInt( st.nextToken() );
        }

        for ( int i = 0 ; i < class_score.length ; i++ )
            Arrays.sort ( class_score[i] );


        int[] max_gap   =   new int[ classes ];
        for ( int i = 0 ; i < class_score.length ; i++ ) {
            for ( int j = 1 ; j < class_score[i].length ; j++ ) {
                if ( class_score[i][j] - class_score[i][j-1] > max_gap[i] )
                    max_gap[i]  =   class_score[i][j] - class_score[i][j-1];
            }
        }


        for ( int i = 0 ; i < class_score.length ; i++ ) {
            sb.append( "Class " + (i+1) + "\n" );
            sb.append( "Max " + class_score[i][class_score[i].length-1] + ", Min " + class_score[i][0] + ", Largest gap " + max_gap[i] + "\n");
        }


        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}
