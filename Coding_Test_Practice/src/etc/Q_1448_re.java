package etc;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q_1448_re {

    public static void main(String args[]) throws IOException {


        BufferedReader br           =   new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw           =   new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb            =   new StringBuilder();

        int lines                   =   Integer.parseInt( br.readLine() );
        ArrayList<Integer> length        =   new ArrayList<>();

        for ( int i = 0 ; i < lines ; i++ )
            length.add( Integer.parseInt( br.readLine() ) );

        Collections.sort ( length, Collections.reverseOrder() );

        int sum =   -1;
        for ( int i = 0 ; i < length.size()-2 ; i++ ){
            if ( length.get(i) < length.get(i+1) + length.get(i+2) ){
                sum     =  length.get(i) + length.get(i+1) + length.get(i+2);
                break;
            }
        }

        sb.append( sum + "\n");
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

}
