package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q_1431 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int guitars = Integer.parseInt(br.readLine());

        Serial[] list = new Serial[guitars];

        for (int i = 0; i < guitars; i++)
            list[i] = new Serial(br.readLine());

        Comparator<Serial> myComparator = new Comparator<Serial>() {
            @Override
            public int compare(Serial o1, Serial o2) {

                if (o1.serial_length > o2.serial_length) {
                    return 1;
                } else if (o1.serial_length == o2.serial_length) {
                    if (o1.serial_sum > o2.serial_sum) {
                        return 1;
                    } else if (o1.serial_sum == o2.serial_sum) {
                        return o1.serial.compareTo(o2.serial);
                    }
                }
                return -1;
            }
        };

        Arrays.sort(list, myComparator);

        for (int i = 0; i < guitars; i++) {
            sb.append(list[i].serial + "\n");
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }


    public static class Serial {

        String serial;
        int serial_length;
        int serial_sum;

        public Serial(String serial) {
            this.serial = serial;
            this.serial_length = serial.length();

            int sum = 0;
            for (int i = 0; i < serial.length(); i++) {
                if ( (int)(serial.charAt(i)) >= 48
                        && (int)(serial.charAt(i)) <= 57)
                    sum += Integer.parseInt(String.valueOf(serial.charAt(i)));
            }
            this.serial_sum = sum;
        }

    }

}
