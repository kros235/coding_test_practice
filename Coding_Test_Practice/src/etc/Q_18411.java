package etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_18411 {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[] grade   = new int[3];

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        for ( int i = 0 ; i < 3 ; i++ )
            grade[i]    =   Integer.parseInt( st.nextToken() );

        Arrays.sort ( grade );

        int sum =   grade[2] + grade[1];
        sb.append ( sum + "\n");
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
