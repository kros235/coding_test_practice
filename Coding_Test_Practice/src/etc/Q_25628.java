package etc;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q_25628 {

    public static long bun, patties;
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer ( br.readLine() );
        bun            =   Long.parseLong( st.nextToken() );
        patties        =   Long.parseLong( st.nextToken() );

        long burger_count   =   0;
        while ( true ){
            boolean result  =   make_burgers ( );
            if ( result == true )
                burger_count ++;
            else
                break;
        }
        sb.append( burger_count + "\n" );

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

    private static boolean make_burgers() {
        if ( bun >= 2 && patties >= 1 ){
            bun -= 2;
            patties --;
            return true;
        }
        else
            return false;
    }

}
