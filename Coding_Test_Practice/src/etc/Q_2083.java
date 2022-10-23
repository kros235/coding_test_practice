package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_2083 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {

            String input = br.readLine();

            if (input.equals("# 0 0"))
                break;

            else {

                StringTokenizer st = new StringTokenizer(input);

                String name = st.nextToken();
                int age = Integer.parseInt(st.nextToken());
                int weight = Integer.parseInt(st.nextToken());

                if (age > 17 || weight >= 80)
                    bw.write(name + " Senior" + "\n");
                else
                    bw.write(name + " Junior" + "\n");
            }

        }

        bw.flush();
        br.close();
        bw.close();


    }
}

