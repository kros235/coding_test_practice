package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_1297 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st  =   new StringTokenizer( br.readLine() );

        int crossLine   =   Integer.parseInt( st.nextToken() );
        int height      =   Integer.parseInt( st.nextToken() );
        int width       =   Integer.parseInt( st.nextToken() );

        double temp     =   Math.sqrt( Math.pow( crossLine, 2) / ( Math.pow ( height, 2 ) + Math.pow( width, 2) ) );

        int result1     =   (int)(height * temp);
        int result2     =   (int)(width * temp);

        sb.append ( result1 + " " + result2);

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
