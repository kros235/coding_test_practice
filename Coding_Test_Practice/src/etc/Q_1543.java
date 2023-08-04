package etc;

import java.io.*;
import java.util.HashMap;

public class Q_1543 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String input_original_String    =   br.readLine();
        String target_string            =   br.readLine();

        int count   =   find_string(input_original_String, target_string);

        sb.append( count );
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

    private static int find_string(String input_original_String, String target_string) {
        int count = 0;

        if ( input_original_String.contains( target_string ) ){
            int start_index =   0;
            while ( (start_index + target_string.length() ) <= input_original_String.length() ){
                if ( input_original_String.substring(start_index, (start_index + target_string.length() )).equals( target_string ) ){
                    count++;
                    start_index =   start_index + target_string.length() ;
                    count += find_string( input_original_String.substring( start_index, input_original_String.length() ), target_string );
                    break;
                }
                else
                    start_index++;
            }
        }

        return count;
    }

}
