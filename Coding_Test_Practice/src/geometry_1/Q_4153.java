package geometry_1;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_4153 {

    public static String check_right_triangle ( int[] lines ){
        int sum = (int) (Math.pow( lines[0], 2 ) + Math.pow( lines[1], 2 ));
        if ( sum    ==  Math.pow( lines[2], 2) )
            return "right";
        else
            return "wrong";
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[] lines = new int[3];

        while (true) {
            String input = br.readLine();
            if (input.equals("0 0 0") == true)
                break;
            else {
                StringTokenizer st = new StringTokenizer(input);
                for (int i = 0; i < 3; i++)
                    lines[i] = Integer.parseInt(st.nextToken());

                Arrays.sort(lines);
                sb.append(check_right_triangle(lines) + "\n");
            }
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }
}
