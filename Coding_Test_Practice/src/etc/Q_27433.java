package etc;

import java.io.*;
import java.util.ArrayList;

public class Q_27433 {



    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        long digit      =    Integer.parseInt( br.readLine() );
        long result     =    1;

        if ( digit == 0 )
            sb.append ( 1 );
        else {
            for (int i = 1; i <= digit; i++)
                result *= i;
            sb.append(result);
        }
        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

}
