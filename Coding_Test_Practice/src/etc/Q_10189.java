package etc;

import java.io.*;
import java.util.Arrays;

public class Q_10189 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        bw.write("#  # #### #### #  #\n" +
                "#### #  # #  # # #\n" +
                "#### #  # #  # # #\n" +
                "#  # #### #### #  #");
        bw.flush();
        br.close();
        bw.close();
    }
}
