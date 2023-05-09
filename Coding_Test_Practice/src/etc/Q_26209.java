package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_26209 {




    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        for ( int i = 0 ; i < 8 ; i++ ){
            if ( Integer.parseInt( st.nextToken() ) == 9 ) {
                sb.append("F");
                break;
            }
            else
                count++;
        }
        if( count == 8 )
            sb.append("S");


        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
