package etc;

import java.io.*;

public class Q_10768 {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int month = Integer.parseInt(br.readLine());
        int day = Integer.parseInt(br.readLine());

        if ( month < 2)
            sb.append("Before");
        else if (month > 2)
            sb.append("After");
        else {
            if ( day < 18)
                sb.append("Before");
            else if ( day > 18)
                sb.append("After");
            else
                sb.append("Special");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
