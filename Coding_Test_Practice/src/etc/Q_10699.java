package etc;

import java.io.*;
import java.time.LocalDate;

public class Q_10699 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringBuilder sb = new StringBuilder();
        sb.append( LocalDate.now().getYear() + "-" + LocalDate.now().getMonthValue() + "-" + LocalDate.now().getDayOfMonth());
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
