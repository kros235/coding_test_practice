import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int numbers_count   =   Integer.parseInt( st.nextToken() );
        int target          =   Integer.parseInt( st.nextToken() );

        int[] numbers =   new int [ numbers_count ];
        st  =   new StringTokenizer( br.readLine() );
        for ( int i = 0 ; i < numbers_count ; i++ )
            numbers[i]    =    Integer.parseInt( st.nextToken() );

        Arrays.sort ( numbers );
        sb.append ( numbers[ target-1 ] );
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
