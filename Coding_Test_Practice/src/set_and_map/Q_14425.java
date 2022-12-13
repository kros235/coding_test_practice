package set_and_map;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_14425 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int set_N_index = Integer.parseInt(st.nextToken());
        int set_M_index = Integer.parseInt(st.nextToken());

        String[] set_N = new String[set_N_index];
        String[] set_M = new String[set_M_index];

        for (int i = 0; i < (set_N_index + set_M_index); i++) {

            if (i < set_N_index)
                set_N[i] = br.readLine();
            else
                set_M[i - set_N_index] = br.readLine();
        }

        Arrays.sort(set_M);
        int count = 0;

        for (int i = 0; i < set_N_index; i++) {
            for (int j = 0; j < set_M_index; j++) {
                if (set_M[j].charAt(0) != set_N[i].charAt(0)) continue;
                else {
                    if (set_M[j].equals(set_N[i]) == true)
                        count++;
                }
            }
        }

        sb.append(count + "\n");
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }
}
