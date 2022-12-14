package etc;

import java.io.*;
import java.util.ArrayList;

public class Q_5524 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int round = Integer.parseInt(br.readLine());
        ArrayList<String> names = new ArrayList<>();

        // insert
        for (int i = 0; i < round; i++)
            names.add(br.readLine());

        // process
        String result = null;
        for (int i = 0; i < round; i++) {
            result = "";
            for (int j = 0; j < names.get(i).length(); j++) {
                if (names.get(i).charAt(j) >= 65 && names.get(i).charAt(j) <= 90) {
                    result += (char) (names.get(i).charAt(j) + 32);
                } else
                    result += names.get(i).charAt(j);
            }
            sb.append(result + "\n");
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();

    }

}
