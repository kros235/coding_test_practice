package sort;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q_10814_re {

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int amount = Integer.parseInt(br.readLine());

        if (amount >= 1 && amount <= 100000) {

            String[][] info = new String[amount][3];

            for (int i = 0; i < amount; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                info[i][0] = st.nextToken();           //  age
                info[i][1] = st.nextToken();           //  name
                info[i][2] = String.valueOf(i);      //  enrollment
            }

            Arrays.sort(info, new Comparator<String[]>() {
                @Override
                public int compare(String[] o1, String[] o2) {
                    if ( o1[0].equals( o2[0]) ) {

                        return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);

                    } else
                        return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
                }
            });

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < amount; i++)
                sb.append(info[i][0] + " " + info[i][1] + "\n");

            bw.write(String.valueOf(sb));
            bw.flush();
            br.close();
            bw.close();

        }
    }
}
