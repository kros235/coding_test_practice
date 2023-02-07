package etc;

import java.io.*;
import java.util.ArrayList;

public class Q_2161 {

    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int total_number = Integer.parseInt(br.readLine());
        ArrayList<Integer> cards = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        // ============================================================
        // input
        // ============================================================
        for (int i = 1; i <= total_number; i++)
            cards.add(i);

        // ============================================================
        // logic function
        // ============================================================
        while (cards.size() != 1) {

            // pop the top card
            sb.append(cards.get(0) + " ");
            cards.remove(0);

            // move card to the bottom
            int temp = cards.get(0);
            cards.remove(0);
            cards.add(temp);

        }
        sb.append(cards.get(0));
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
