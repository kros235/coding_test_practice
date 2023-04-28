package etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_21300 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int sum =   0;
        for ( int i = 0 ; i < 6 ; i ++ ){
            sum += Integer.parseInt( st.nextToken() );
        }

        bw.write((sum * 5) + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

}
