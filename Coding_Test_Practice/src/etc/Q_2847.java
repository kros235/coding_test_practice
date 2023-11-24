package etc;

import java.io.*;
import java.util.ArrayList;

public class Q_2847 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        int stages                  =   Integer.parseInt ( br.readLine() );
        ArrayList<Integer> rewards  =   new ArrayList<>();

        for ( int i = 0 ; i < stages ; i++ )
            rewards.add( Integer.parseInt( br.readLine() ) );

        int counter =   0;
        for ( int i = rewards.size() - 1 ; i > 0 ; i-- ){
            int current_point   =   rewards.get(i);
            int prev_point      =   rewards.get(i-1);
            while ( prev_point >= current_point ){
                counter++;
                prev_point--;
            }
            rewards.set(i-1, prev_point);
        }

        sb.append ( counter + "\n" );

        bw.write(sb.toString());
        br.close();
        bw.close();

    }

}
