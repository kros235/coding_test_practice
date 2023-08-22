package etc;

import java.io.*;
import java.util.*;

public class Q_15963 {

    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        long required    =   Long.parseLong( st.nextToken() );
        long provided    =   Long.parseLong( st.nextToken() );

        if ( required   ==  provided )
            sb.append ("1\n");
        else
            sb.append ("0\n");


        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
