package basic_mathmatics_1;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;

public class Q_10250 {
    public static String get_room_no(int height, int width, int customer) {

        int room_level, room_column;

        room_column = (customer / height);
        if (room_column == 0 || customer % height != 0)
            room_column++;

        room_level = customer % height;
        if (room_level == 0)
            room_level = height;

        if (room_column < 10)
            return room_level + "0" + room_column;
        else
            return room_level + "" + room_column;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String round = br.readLine();
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(round); i++) {
            String input = br.readLine();
            String[] inputs = input.split(" ");

            int height = Integer.parseInt(inputs[0]);
            int width = Integer.parseInt(inputs[1]);
            int customer = Integer.parseInt(inputs[2]);

            if (height < 1 || width < 1 || height > 99 || width > 99
                    || customer < 1 || customer > (height * width)) {
            } else
                result.add(get_room_no(height, width, customer));
        }

        for (int i = 0; i < result.size(); i++)
            bw.write(result.get(i) + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
