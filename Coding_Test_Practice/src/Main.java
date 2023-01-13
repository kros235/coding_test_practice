import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb    =   new StringBuilder();
        StringTokenizer st  =   new StringTokenizer( br.readLine() );

        int rounds      =   Integer.parseInt( st.nextToken() );
        long plug_sum    =   0;


        for ( int i = 0 ; i < rounds ; i++ ) {
            int plug =  Integer.parseInt( br.readLine() );
            if ( i != rounds - 1)
                plug_sum += ( plug - 1 );
            else
                plug_sum += plug;
        }

        sb.append( plug_sum + "\n");

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }
}


