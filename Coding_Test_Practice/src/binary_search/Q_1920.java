package binary_search;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class Q_1920 {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        // =========================
        // input
        // =========================
        int card_amount = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();


        // =========================
        // input
        // =========================
        for (int i = 0; i < card_amount; i++)
            map.put(Integer.parseInt(st.nextToken()), 0);

        // =========================
        // logic
        // =========================
        int candidate_amount = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < candidate_amount; i++) {
            if (map.containsKey(Integer.parseInt(st.nextToken())) == true)
                sb.append("1\n");
            else
                sb.append("0\n");
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
