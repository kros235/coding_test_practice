package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_25238 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st          =   new StringTokenizer( br.readLine() );
        int defend_rate             =   Integer.parseInt( st.nextToken() );
        int defend_ignorance_rate   =   Integer.parseInt( st.nextToken() );

        StringBuilder sb = new StringBuilder();

        if ( defend_ignorance_rate == 0 && defend_rate < 100)
            sb.append(1);
        else if ( defend_rate * (100 - defend_ignorance_rate)/100 >= 100)
            sb.append(0);
        else
            sb.append(1);
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
