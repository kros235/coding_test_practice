package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_2475 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st  =   new StringTokenizer( br.readLine() );

        int result = 0;
        for (int i = 0 ; i < 5 ; i++)
            result += (int) Math.pow ( Integer.parseInt( st.nextToken() ), 2 );

        result = result % 10;
        bw.write( String.valueOf(result) );

        bw.flush();
        br.close();
        bw.close();

    }
}
