package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_1392 {

    public static long find_which_note_you_are(long[] music_note, long queries) {
        int index = 0;
        long time_duration = 0;
        while (true) {
            time_duration += music_note[index];
            if (queries <= time_duration - 1)
                return index + 1;
            else index++;
        }
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int total_music_note_amount = Integer.parseInt(st.nextToken());
        int queries_amount = Integer.parseInt(st.nextToken());

        long[] time_consumption = new long[total_music_note_amount];

        // ============================================================
        // input
        // ============================================================
        for (int i = 0; i < total_music_note_amount; i++)
            time_consumption[i] = Long.parseLong(br.readLine());

        // ============================================================
        // logic function
        // ============================================================

        for (int i = 0; i < queries_amount; i++)
            sb.append(find_which_note_you_are(time_consumption, Long.parseLong(br.readLine())) + "\n");

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }
}
