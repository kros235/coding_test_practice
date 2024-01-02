package etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_29940 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        StringTokenizer st = new StringTokenizer(br.readLine());
        int sizeA = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        int[] setA = new int[sizeA];

        for (int j = 0; j < sizeA; j++)
            setA[j] = Integer.parseInt(br.readLine());
        Arrays.sort(setA);

        int start = 0;
        int end = setA.length - 1;
        int result = 0;
        while (start < end) {
            //int mid =   setA [ ( start + end ) / 2 ];
            int sum = setA[start] + setA[end];
            if (sum == target) {
                start++;
                end--;
                result++;
            } else {
                if (sum > target)
                    end--;
                else
                    start++;
            }

        }

        sb.append(result + "\n");
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

}
