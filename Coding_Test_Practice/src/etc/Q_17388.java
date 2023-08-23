package etc;

import java.io.*;
import java.util.*;

public class Q_17388 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        long Soongsil    =   Long.parseLong( st.nextToken() );
        long Korea       =   Long.parseLong( st.nextToken() );
        long Hanyang     =   Long.parseLong( st.nextToken() );

        if ( Soongsil + Korea + Hanyang >= 100 )
            sb.append ("OK\n");
        else
            sb.append ( findMin( Soongsil, Korea, Hanyang ) + "\n");


        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

    private static String findMin(long soongsil, long korea, long hanyang) {
        if ( soongsil < korea ){
            if ( soongsil < hanyang )
                return "Soongsil";
            else
                return "Hanyang";
        }
        else{
            if ( korea < hanyang )
                return "Korea";
            else
                return "Hanyang";
        }
    }
}
