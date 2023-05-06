package etc;

import java.io.*;
import java.util.ArrayList;

public class Q_9507 {

    public static long get_koong(int round){
        ArrayList<Long> koong = new ArrayList<>();
        koong.add(1L);
        koong.add(1L);
        koong.add(2L);
        koong.add(4L);

        if ( round  < 4 )
            return koong.get( round );
        else{
            for ( int i = 4 ; i <= round ; i++ )
                koong.add( koong.get(i-1) + koong.get(i-2) + koong.get(i-3) + koong.get(i-4) );
            return koong.get ( round );
        }
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        int amount = Integer.parseInt(br.readLine());

        for ( int i = 0 ; i < amount ; i++ )
            sb.append ( get_koong( Integer.parseInt( br.readLine() ) ) + "\n" );
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
