package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_26082 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int price           =   Integer.parseInt( st.nextToken() );
        int performance     =   Integer.parseInt( st.nextToken() );
        int warboy_price    =   Integer.parseInt( st.nextToken() );

        StringBuilder sb = new StringBuilder();

        sb.append( ( ( (performance/price) * warboy_price ) * 3) + "\n");
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
