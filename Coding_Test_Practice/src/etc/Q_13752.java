package etc;

import java.io.*;

public class Q_13752 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int round       =   Integer.parseInt( br.readLine() );
        for ( int i = 0 ; i < round ; i++ ) {
            int row       =   Integer.parseInt( br.readLine() );
            for ( int j = 0 ; j < row ; j++ )
                sb.append("=");
            sb.append("\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
