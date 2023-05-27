package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_2845 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st      =   new StringTokenizer( br.readLine() );
        int person_per_space    =   Integer.parseInt( st.nextToken() );
        int space               =   Integer.parseInt( st.nextToken() );

        int total_ppl           =   person_per_space * space;

        st  =   new StringTokenizer( br.readLine() );
        for ( int i = 0 ; i < 5 ; i++ )
            sb.append( ( Integer.parseInt( st.nextToken() ) - total_ppl  ) + " " );

        sb.append( "\n" );
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
