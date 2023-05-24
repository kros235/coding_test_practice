package etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_13627 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int divers      = Integer.parseInt( st.nextToken() );
        int returners   = Integer.parseInt( st.nextToken() );

        int[] index     =   new int[ divers + 1 ];
        Arrays.fill( index, 0 );

        String input    = br.readLine();
        st  =   new StringTokenizer( input );
        for (int i = 0; i < returners ; i++) {
            int num =   Integer.parseInt( st.nextToken() );
            index[ num ]    =   1;
        }

        if ( divers - returners > 0) {
            for (int i = 1; i < index.length; i++) {
                if (index[i] == 0)
                    sb.append( i + " ");
            }
        }
        else
            sb.append ("*");
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
