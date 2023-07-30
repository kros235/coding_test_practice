package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q_19944 {

    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if ((M == 1) || (M == 2))
            sb.append("NEWBIE!");

        else if (M <= N)
            sb.append("OLDBIE!");

        else
            sb.append("TLE!");

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();

    }

}
