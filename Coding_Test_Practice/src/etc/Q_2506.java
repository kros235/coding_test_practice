package etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_2506 {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        long round  =   Integer.parseInt( br.readLine() );
        long sum    =   0, previous_score   =   1;

        StringTokenizer st  =   new StringTokenizer(br.readLine());
        for (int i = 0 ; i < round ; i++) {
            long score          =   Long.parseLong( st.nextToken() );

            if ( score != 0 )
                sum     +=  score * previous_score++;
            else
                previous_score = 1;

        }
        sb.append ( sum + "\n" );
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
