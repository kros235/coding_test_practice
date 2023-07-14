package etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_6550 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();



        while(true) {
            String input    = br.readLine();
            if ( input  ==  null    )
                break;
            else {

                StringTokenizer st = new StringTokenizer(input);
                String find_string = st.nextToken();
                String target_string = st.nextToken();

                int start_index = 0;
                boolean matched = true;
                for (int i = 0; i < find_string.length(); i++) {
                    target_string = check_partial_string(find_string.charAt(i), target_string.substring(start_index, target_string.length()));
                    if (target_string.equals("-1")) {
                        sb.append("No\n");
                        matched = false;
                        break;
                    }
                }
                if (matched != false)
                    sb.append("Yes\n");
            }
        }


        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

    private static String check_partial_string(char letter, String substring) {
        for ( int i = 0 ; i < substring.length() ; i++ ){
            if ( substring.charAt(i) == letter )
                return substring.substring( i+1 , substring.length() );
        }
        return "-1";
    }
}
