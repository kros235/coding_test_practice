package etc;

import java.io.*;

public class Q_6749 {


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int youngest_child_age    =   Integer.parseInt( br.readLine() );
        int middle_child_age      =   Integer.parseInt( br.readLine() );
        int oldest_chile_age      =   ( middle_child_age * 2 ) - youngest_child_age;

        sb.append( oldest_chile_age + "\n" );
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
