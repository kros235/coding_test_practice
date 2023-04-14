package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_15680 {



    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int code      =   Integer.parseInt( br.readLine() );

        if ( code == 0 )
            sb.append( "YONSEI" );
        else
            sb.append( "Leading the Way to the Future" );

        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
        }


}
