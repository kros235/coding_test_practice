import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );

        int time    =   Integer.parseInt( st.nextToken() );
        int drink   =   Integer.parseInt( st.nextToken() );

        if ( drink == 1 || time < 12 || time > 16 )
            sb.append ( 280 );
        else
            sb.append ( 320 );

        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}