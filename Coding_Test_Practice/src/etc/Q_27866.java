package etc;

import java.io.*;
import java.util.ArrayList;

public class Q_27866 {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String input         =   br.readLine();
        int target           =   Integer.parseInt( br.readLine() );

        sb.append( input.charAt( target-1 ) );
        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

}
