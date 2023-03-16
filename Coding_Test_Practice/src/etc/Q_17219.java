package etc;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q_17219 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        HashMap< String, String > password_list = new HashMap<>();

        StringTokenizer st =   new StringTokenizer( br.readLine() );
        int list           =   Integer.parseInt( st.nextToken() );
        int queries        =   Integer.parseInt( st.nextToken() );

        for( int i = 0 ; i < list ; i++ ){
            st =   new StringTokenizer( br.readLine() );
            password_list.put( st.nextToken(), st.nextToken() );
        }

        for( int i = 0 ; i < queries ; i++ ){
            String website  =   br.readLine();
            sb.append( password_list.get( website ) + "\n" );
        }

        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
