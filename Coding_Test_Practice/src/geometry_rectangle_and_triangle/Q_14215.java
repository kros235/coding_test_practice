package geometry_rectangle_and_triangle;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_14215 {



    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());


        int[] lines = new int[3];
        for (int i = 0; i < 3; i++)
            lines[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(lines);

        if (lines[2] < (lines[0] + lines[1]))
            sb.append( lines[0] + lines[1] + lines[2]);
        else
            sb.append((lines[0] + lines[1]) * 2 - 1);


        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

}
