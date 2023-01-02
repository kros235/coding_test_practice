package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_1225 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String first    =   st.nextToken();
        String second   =   st.nextToken();

        long result = 0;

        for (int i = 0; i < first.length(); i++)
            for (int j = 0; j < second.length(); j++)
                result += Integer.parseInt(String.valueOf(first.charAt(i))) * Integer.parseInt(String.valueOf(second.charAt(j)));


        sb.append(result);
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
