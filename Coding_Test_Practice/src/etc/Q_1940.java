package etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_1940 {

    public static int binarySearch(long key, long[] arr, int low, int high) {
        int mid;

        while(low <= high) {
            mid = (low + high) / 2;

            if(key == arr[mid]) {
                return mid;
            } else if(key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1; // 탐색 실패
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int array_size  =   Integer.parseInt( br.readLine() );
        long[] array    =   new  long[array_size];
        int count       =   0;

        int target_num  =   Integer.parseInt( br.readLine() );

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < array_size; i++)
            array[i] = Long.parseLong( st.nextToken() );

        Arrays.sort( array );

        for (int i = 0; i < array_size; i++){

            int result  =   binarySearch ( (target_num - array[i]), array, 0, array_size-1);

            if (result != -1) count++ ;

        }

        sb.append( count / 2 );

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
