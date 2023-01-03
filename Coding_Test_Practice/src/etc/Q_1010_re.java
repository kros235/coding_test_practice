package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q_1010_re {

    public static BigInteger factorial(BigInteger number) {

        if (number.compareTo(new BigInteger(String.valueOf(0))) == 0)
            return new BigInteger(String.valueOf(1));
        else
            return number.multiply(factorial(number.subtract(BigInteger.valueOf(1))));
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int round = Integer.parseInt(br.readLine());

        for (int i = 0; i < round; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            String first = st.nextToken();
            String second = st.nextToken();

            BigInteger result = (factorial(new BigInteger(second)))
                    .divide(factorial(new BigInteger(String.valueOf((Integer.parseInt(second) - Integer.parseInt(first)))))
                            .multiply(factorial(new BigInteger(first))));
            sb.append(result + "\n");
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
