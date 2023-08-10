package greedy_algorithm;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q_1931 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int conference_count    =   Integer.parseInt ( br.readLine() );
        conference[] schedule    =   new conference[ conference_count ];

        for ( int i = 0 ; i <  conference_count ; i++ ){
            StringTokenizer st  =   new StringTokenizer( br.readLine() );
            schedule[i] =   new conference( Integer.parseInt( st.nextToken() ), Integer.parseInt( st.nextToken() ) );
        }

        Comparator<conference> myComparator   =   new Comparator<conference>() {
            @Override
            public int compare(conference o1, conference o2) {
                    if ( o1.end_time != o2.end_time ){
                    return o1.end_time - o2.end_time;
                }
                else {
                    if ( o1.start_time != o2.start_time ){
                        return o1.start_time - o2.start_time;
                    }
                    else
                        return o1.duration - o2.duration;
                }
            }
        };

        Arrays.sort ( schedule, myComparator );

        int reservation_count   =   0;
        int start_time          =   -1;
        for ( int i = 0 ; i <  conference_count ; i++ ){
            if ( start_time == -1 ){
                reservation_count++;
                start_time   =   schedule[i].end_time;
                //System.out.println( schedule[i].start_time + " , " + schedule[i].end_time + " = " + schedule[i].duration );
            }
            else{
                if ( start_time <= schedule[i].start_time ){
                    reservation_count++;
                    start_time   =   schedule[i].end_time;
                    //System.out.println( schedule[i].start_time + " , " + schedule[i].end_time + " = " + schedule[i].duration );
                }
                else
                    continue;
            }
        }

        sb.append ( reservation_count + "\n" );
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

    public static class conference{

        int start_time;
        int end_time;
        int duration;

        public conference(int start_time, int end_time ) {
            this.start_time =   start_time;
            this.end_time   =   end_time;
            this.duration   =   end_time - start_time;
        }
    }

}
