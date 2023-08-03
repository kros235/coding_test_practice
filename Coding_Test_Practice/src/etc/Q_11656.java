package etc;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Q_11656 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String input    =   br.readLine();
        String[] end_words  =   new String[input.length()];

        for ( int i = 0 ; i < input.length() ; i++ )
            end_words[i]    =   input.substring(i, input.length() );

        //Arrays.sort( end_words );
        Comparator myComparator =   new Comparator<>() {
            @Override
            public int compare(Object o1, Object o2) {
                return o1.toString().compareTo( o2.toString() );
            }
        };

        Arrays.sort( end_words, myComparator ) ;

        for ( int i = 0 ; i < end_words.length ; i++ )
            sb.append( end_words[i] + "\n");
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
