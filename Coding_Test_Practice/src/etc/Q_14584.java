package etc;

import java.io.*;
import java.util.HashMap;

public class Q_14584 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        String code     =   br.readLine();
        int count       =   Integer.parseInt( br.readLine() );
        String[] dic    =   new String[count];

        for ( int i = 0 ; i < count ; i++ )
            dic[i]  =   br.readLine();

        int shifted =   0;
        for ( int i = 1; i  <= 26 ; i++ ){
            String plain_text   =   get_shifted_text(code, i);

            boolean included =   false;
            for ( int j = 0 ; j < count ; j++ ) {
                if ( plain_text.contains( dic[j] ) ){
                    included = true;
                    break;
                }
            }

            if (included == true ) {
                sb.append( plain_text + "\n");
                break;
            }
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();

    }

    private static String get_shifted_text(String code, int hop) {
        String result = "";

        for ( int i = 0 ; i < code.length() ; i++ ){
            if ( (int)(code.charAt(i) + hop) > 122 ){
                result += (char)(code.charAt(i) + hop -26);
            }
            else
                result += (char)(code.charAt(i) + hop);
        }


        return result;
    }

}
