package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.HashMap;

public class Q_1094 {

    private static int count_sticks(int target_length, int stick_length) {

        int counter = 0;

        while (true) {
            if (target_length == stick_length) {
                counter++;
                break;
            }

            else if (target_length < stick_length)
                stick_length /= 2;

            else{
                target_length -= stick_length;
                counter++;
            }
        }
        return counter;
    }


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int target_length = Integer.parseInt(br.readLine());
        int result = count_sticks(target_length, 64);

        sb.append(result + "\n");
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }
}
