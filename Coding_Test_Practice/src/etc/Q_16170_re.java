package etc;

import java.io.*;
import java.util.Arrays;
import java.util.Calendar;
import java.util.StringTokenizer;

public class Q_16170_re {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Calendar cal = Calendar.getInstance();
        sb.append(cal.get(cal.YEAR) + "\n");
        sb.append(cal.get(cal.MONTH)+1 + "\n");
        sb.append(cal.get(cal.DATE) + "\n");

        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
