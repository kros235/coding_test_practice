
import java.io.*;
import java.util.*;

public class Main {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int day                     =   Integer.parseInt( br.readLine() );

        StringTokenizer st          =   new StringTokenizer( br.readLine() );
        ArrayList<Long> work_out =   new ArrayList<>();

        for ( int i = 0 ; i < day ; i++ )
            work_out.add ( Long.parseLong( st.nextToken() ) );

        Collections.sort( work_out, Collections.reverseOrder() );

        long max     =   -1;
        int front   =   0;
        int end     =   work_out.size() - 1;
        if ( work_out.size() % 2 == 1 ) {
            max = work_out.get(0);
            front   =   1;
        }


        if ( work_out.size() > 1 ) {
            for (int i = 0; ; i++) {

                if (work_out.get(front + i) + work_out.get(end - i) > max)
                    max = work_out.get(front + i) + work_out.get(end - i);

                if (front + i >= end - i)
                    break;

            }
        }

        sb.append(max + "\n");
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}