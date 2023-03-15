package etc;

import java.io.*;
import java.util.ArrayList;

public class Q_11536 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int player_amount = Integer.parseInt(br.readLine());
        ArrayList<String> name = new ArrayList<>();

        for (int i = 0; i < player_amount; i++)
            name.add(br.readLine());

        boolean increasing = true;
        boolean decreasing = true;

        // -1   =   decreasing,  1  =   increasing
        int result = check_order(name.get(0), name.get(1));
        if (result == -1)
            increasing = false;
        else
            decreasing = false;

        if (player_amount > 2) {
            result = check_order(name.get(1), name.get(2));
            if (result == -1)
                increasing = false;
            else
                decreasing = false;
        }


        if (increasing == false && decreasing == false)
            sb.append("NEITHER");
        else {
            if (increasing == true)
                sb.append("INCREASING");
            else
                sb.append("DECREASING");
        }

        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

    private static int check_order(String s, String s1) {

        // -1   =   decreasing, 1   =   increasing

        int length;
        if (s.length() < s1.length())
            length = s.length();
        else
            length = s1.length();

        for (int i = 0; i < length; i++) {
            if ((int) s.charAt(i) == (int) s1.charAt(i))
                continue;
            else {
                if ((int) s.charAt(i) > (int) s1.charAt(i))
                    return -1;
                else
                    return 1;
            }
        }

        return -1;
    }
}
