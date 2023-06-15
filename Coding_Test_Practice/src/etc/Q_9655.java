package etc;

import java.io.*;

public class Q_9655 {

   public static void main(String args[]) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       StringBuilder sb = new StringBuilder();

       int     total_stones       =   Integer.parseInt( br.readLine() );

       if ( total_stones % 2 == 1 )
           sb.append ( "SK\n");
       else
           sb.append ( "CY\n");
       bw.write(String.valueOf(sb));
       bw.flush();
       br.close();
       bw.close();
    }

}
