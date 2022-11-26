package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q_25372 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int round = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();


        for (int i = 0 ; i < round ; i++){

            boolean checker = true;
            String test =   br.readLine();

            if ( test.length() >= 6 && test.length() <= 9)
                checker = true;
            else
                checker = false;

            for (int j = 0; j < test.length(); j++) {
                char partial = test.charAt(j);

                if ((partial >= 48 && partial <= 57)
                        || (partial >= 65 && partial <= 90)
                        || (partial >= 97 && partial <= 122))
                    continue;
                else {
                    checker = false;
                    break;
                }
            }

            if ( checker == true)
                sb.append( "yes\n");
            else
                sb.append( "no\n");
        }


        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
