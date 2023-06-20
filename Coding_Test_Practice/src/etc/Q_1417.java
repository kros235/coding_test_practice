package etc;

import java.io.*;

public class Q_1417 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int vote_changer_count = 0;

        int members = Integer.parseInt(br.readLine());
        int[] votes =   new int[members];

        for ( int i = 0 ; i < members ; i++ )
            votes[i] = Integer.parseInt( br.readLine() );

        while (true) {

            if ( votes[0] == find_max (votes) && check_unique_max_vote ( find_max (votes), votes ) == true ) {
                sb.append( vote_changer_count + "\n" );
                break;
            }
            else{
                int current_max_index =   find_max_index( votes );
                votes[0] ++;
                votes[current_max_index] --;
                vote_changer_count++;
            }

        }
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

    private static boolean check_unique_max_vote(int max, int[] votes) {

        int duplicate_counter   =   0;
        for ( int i = 0 ; i < votes.length ; i++ )
            if ( max == votes[i] )
                duplicate_counter++;
        if ( duplicate_counter == 1 )
            return true;
        else
            return false;
    }


    private static int find_max(int[] votes) {
        int max =   -999;
        for ( int i = 0 ; i < votes.length ; i++ )
            if ( max < votes[i] )
                max = votes[i];
        return max;
    }

    private static int find_max_index(int[] votes) {
        int max =   -999;
        int max_index   =   0;
        for ( int i = 1 ; i < votes.length ; i++ )
            if ( max < votes[i] ) {
                max = votes[i];
                max_index = i;
            }
        return max_index;
    }

}
