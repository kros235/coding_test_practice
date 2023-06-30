package etc;

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.StringTokenizer;

public class Q_5635 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int ppl_count = Integer.parseInt(br.readLine());

        Calendar min_date = Calendar.getInstance();
        min_date.set(1990, 1, 1);


        //Calendar now_date = Calendar.getInstance();
        //now_date.set(1990, 1, 3);

        //sb.append (now_date.getTimeInMillis() - min_date.getTimeInMillis() );


        String[][] ppl_info = new String[ppl_count][2];
        for (int i = 0; i < ppl_count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());

            Calendar now_date = Calendar.getInstance();
            now_date.set(year, month, day);

            ppl_info[i][0] = String.valueOf((now_date.getTimeInMillis() - min_date.getTimeInMillis()) / 1000 / 60 / 60);
            ppl_info[i][1] = name;
        }


        String youngest_name = null, oldest_name = null;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < ppl_count; i++) {

            if (min > Integer.parseInt(ppl_info[i][0])) {
                min = Integer.parseInt(ppl_info[i][0]);
                oldest_name = ppl_info[i][1];
            }

            if (max < Integer.parseInt(ppl_info[i][0])) {
                max = Integer.parseInt(ppl_info[i][0]);
                youngest_name = ppl_info[i][1];
            }
        }


        sb.append(youngest_name + "\n" + oldest_name);
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
