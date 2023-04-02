package general_mathematics_1;

import java.io.*;
import java.util.ArrayList;

public class Q_2903 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int round    =   Integer.parseInt( br.readLine() );
        int squares  =   (int) Math.sqrt( Math.pow( 4, round ) );
        int dots     =   (int) Math.pow ( squares + 1 , 2 );
        sb.append( dots );


        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();

    }
}

/*
0   :   01   04   (2)
1   :   04   09   (3)
2   :   16   25  (5)
3   :   64   81  (9)
*/