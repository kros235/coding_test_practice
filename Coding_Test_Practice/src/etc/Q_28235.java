package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_28235 {



    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String input =   br.readLine();
        switch ( input ){
            case "SONGDO":{
                sb.append("HIGHSCHOOL\n");
                break;
            }
            case "CODE":{
                sb.append("MASTER\n");
                break;
            }
            case "2023":{
                sb.append("0611\n");
                break;
            }
            default:{
                sb.append("CONTEST\n");
                break;
            }
        }

        bw.write( String.valueOf( sb ) );
        bw.flush();
        br.close();
        bw.close();
    }
}
