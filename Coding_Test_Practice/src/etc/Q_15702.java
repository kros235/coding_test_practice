package etc;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q_15702 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int question_count = Integer.parseInt(st.nextToken());
        int candidate_count = Integer.parseInt(st.nextToken());

        int score[]         =   new int[ question_count ];
        candidate[] list = new candidate[candidate_count];

        st = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < question_count ; i++ )
            score[i]    =   Integer.parseInt( st.nextToken() );



        for ( int i = 0 ; i < candidate_count ; i++ ){
            st = new StringTokenizer(br.readLine());
            int id  =   Integer.parseInt( st.nextToken() );

            int total_score   =   0;
            for ( int j = 0 ; j < question_count ; j++ ){
                if ( st.nextToken() . equals("O") == true)
                    total_score += score[j];
            }

            list[i] =   new candidate( id, total_score );
        }

        Comparator<candidate> myComparator  =   new Comparator<candidate>() {
            @Override
            public int compare(candidate o1, candidate o2) {
                if ( o1.score > o2.score )
                    return 1;
                else if ( o1.score == o2.score ){
                    if ( o1.id < o2.id )
                        return 1;
                }
                return -1;
            }
        };

        Arrays.sort ( list, myComparator );

        sb.append ( list[ list.length-1 ].id + " " + list[ list.length -1 ].score +  "\n" );

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

    public static class candidate {

        int id;
        int score;

        public candidate(int id, int score) {
            this.id = id;
            this.score = score;
        }
    }

}
