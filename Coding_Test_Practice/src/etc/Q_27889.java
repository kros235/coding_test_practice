package etc;

import java.io.*;
import java.util.Arrays;

public class Q_27889 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String input    =   br.readLine();

        switch ( input ){
            case "NLCS" : {
                sb.append("North London Collegiate School");
                break;
            }
            case "BHA" : {
                sb.append("Branksome Hall Asia");
                break;
            }
            case "KIS" : {
                sb.append("Korea International School");
                break;
            }
            default: {
                sb.append("St. Johnsbury Academy");
                break;
            }
        }

        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();

    }
}
