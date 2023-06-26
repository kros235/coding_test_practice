package etc;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q_2343_re {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int total_lesson    =   Integer.parseInt( st.nextToken() );
        int disk_amount     =   Integer.parseInt( st.nextToken() );


        int[] lesson_length =   new int[ total_lesson ];
        st  =   new StringTokenizer( br.readLine() );
        int total_duration  =   0;
        int max =   -999;
        for ( int i = 0 ; i < total_lesson ; i++ ) {
            lesson_length[i] = Integer.parseInt(st.nextToken());
            total_duration  +=  lesson_length[i];
            if( max < lesson_length[i] )
                max =   lesson_length[i];
        }

        ArrayList<Integer> division_duration    =   new ArrayList<>();
        int start_min   =   max;
        int end_min     =   total_duration;




        while ( start_min <= end_min ){

            int median  =   ( start_min + end_min ) / 2;
            boolean possibility_check   =   check_disk_partitioning ( lesson_length, median, disk_amount );
            if ( possibility_check == true ) {
                division_duration.add(median);
                end_min = median - 1;
            }
            else
                start_min   =   median + 1;
        }

        int min =   division_duration.get(0);
        for ( int i = 0 ; i < division_duration.size() ; i++ )
            if ( min > division_duration.get(i) )
                min =   division_duration.get(i);

        sb.append ( min );
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

    public static boolean check_disk_partitioning(int[] lessons, int median, int disk_amount){
        int current_disk_count = 1;
        int disk_space = median;
        for ( int i = 0 ; i < lessons.length ; i++ ){

            if ( disk_space >= lessons[i] ) {
                disk_space -= lessons[i];
            }
            else {
                current_disk_count++;
                disk_space  =   median;
                disk_space -= lessons[i];
            }

        }

        if ( current_disk_count <= disk_amount )
            return true;
        else
            return false;
    }

}
