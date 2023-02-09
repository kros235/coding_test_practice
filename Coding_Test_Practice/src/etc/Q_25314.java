package etc;

import java.io.*;

public class Q_25314 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int byte_size  =   Integer.parseInt( br.readLine() );

        for (int i = 0; i < byte_size / 4 ; i++)
            sb.append( "long " );

        sb.append( "int" );

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
