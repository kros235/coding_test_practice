package basic_mathematics_1;

import java.io.*;
import java.util.ArrayList;

public class Q_2292 {
    public static ArrayList<Long> generate_boundaries(long a) {

        ArrayList<Long> boundaries = new ArrayList<>();
        boundaries.add(0, 1L);

        for (int i = 0; ; i++) {
            if (a > boundaries.get(i))
                boundaries.add(i + 1, (boundaries.get(i) + (6 * (i + 1))));
            else
                break;
        }

        return boundaries;
    }

    public static long find_circle(long a) {

        long result = 0;
        ArrayList<Long> boundaries = new ArrayList<>();
        boundaries = generate_boundaries(a);

        for (int i = 0; i < boundaries.size(); i++) {
            if (a <= boundaries.get(i))
                return (i + 1);
        }

        return 0;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String digit = br.readLine();
        if (Long.parseLong(digit) < 1 || Long.parseLong(digit) > 1000000000) {
        } else {
            long circle_result = find_circle(Long.parseLong(digit));
            bw.write(String.valueOf(circle_result));
        }
        bw.flush();
        br.close();
        bw.close();

    }
}
