package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_2455 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        long total_passenger =   0;
        long max             = -99;
        for ( int i = 0 ; i < 4 ; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long landers = Long.parseLong(st.nextToken());
            long borders = Long.parseLong(st.nextToken());
            total_passenger = total_passenger + borders - landers;

            if ( total_passenger > max )
                max =   total_passenger;
        }

        sb.append( max + "\n" );

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

}
