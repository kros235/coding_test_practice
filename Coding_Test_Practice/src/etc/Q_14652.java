package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_14652 {


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );

        int row     =   Integer.parseInt( st.nextToken() );
        int column  =   Integer.parseInt( st.nextToken() );
        int spot    =   Integer.parseInt( st.nextToken() );

        int counter     =   0;
        boolean finder  =   false;

        for (int i = 0 ; i < row ; i++ ){
            for (int j = 0 ; j < column ; j ++ ){
                if ( counter == spot) {
                    sb.append(i + " " + j + "\n");
                    finder = true;
                    break;
                }
                counter++;
            }
            if (finder == true ) break;
        }
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
