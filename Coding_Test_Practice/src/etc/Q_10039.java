package etc;

import java.io.*;

public class Q_10039 {

    public static void main(String args[]) throws IOException {

        BufferedReader br   = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw   = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb    = new StringBuilder();

        int sum =   0;
        for ( int i = 0 ; i < 5 ; i++ ) {
            int score   =   Integer.parseInt(br.readLine());
            if ( score < 40)
                sum += 40;
            else
                sum += score;
        }

        sb.append( sum/5 );
        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
