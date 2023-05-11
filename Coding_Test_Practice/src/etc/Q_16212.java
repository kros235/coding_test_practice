package etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_16212 {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int size = Integer.parseInt(br.readLine());
        int[] container = new int[size];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++)
            container[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(container);

        for (int i = 0; i < size; i++)
            sb.append(container[i] + " ");


        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
