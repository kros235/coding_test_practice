package etc;

import java.io.*;
import java.util.ArrayList;

public class Q_1212 {

    static int transform_count = 0;

    public static String get_binary_number(int partial_octal) {


        String result = Integer.toString(partial_octal, 2);
        if (transform_count != 0) {
            if (result.length() == 1)
                result = "00" + Integer.toString(partial_octal, 2);
            else if (result.length() == 2)
                result = "0" + Integer.toString(partial_octal, 2);
        }

        transform_count++;
        return result;

    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        ArrayList<String> binary = new ArrayList<>();

        String octal = br.readLine();
        int octal_length = octal.length();


        if (octal_length > 333334) {
        } else {


            for (int i = 0; i < octal_length; i++) {
                int partial_octal = Integer.parseInt(String.valueOf(octal.charAt(i)));
                binary.add(get_binary_number(partial_octal));
            }
        }

        for (int i = 0; i < binary.size(); i++)
            bw.write(binary.get(i));

        bw.flush();
        br.close();
        bw.close();
    }

}
