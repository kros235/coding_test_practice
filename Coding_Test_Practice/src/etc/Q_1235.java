package etc;

import java.io.*;
import java.util.HashMap;

public class Q_1235 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int student_count       =   Integer.parseInt( br.readLine() );
        String[] student_code   =   new String[student_count];
        for ( int i = 0 ; i < student_count ; i++ )
            student_code[i]     =   br.readLine();

        HashMap<String, Integer> distinct_checker  =   new HashMap<>();

        for ( int i = 1 ; i <= 100 ; i++ ){
            distinct_checker.clear();

            for ( int j = 0 ; j < student_count ; j++ ) {
                if ( distinct_checker.get( student_code[j].substring( student_code[j].length()-i) ) == null )
                    distinct_checker.put( student_code[j].substring( student_code[j].length()-i), 1 );
                else
                    break;
            }

            if ( distinct_checker.size() == student_count ) {
                sb.append(i);
                break;
            }
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
