package general_mathematics_1;

import java.io.*;
import java.util.StringTokenizer;

public class Q_11005 {


    public static char translator(long num) {
        if (num >= 0 && num < 10)
            return String.valueOf(num).charAt(0);
        else
            return (char) (num + 55);
    }
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        StringTokenizer st = new StringTokenizer(br.readLine());
        Long line = Long.parseLong(st.nextToken());
        Long num = Long.parseLong(st.nextToken());
        String result = "";


        while (line >= num) {
            result = translator(line % num) + result;
            line /= num;
        }
        result = translator(line % num) + result;
        sb.append(result);

        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();

    }
}
