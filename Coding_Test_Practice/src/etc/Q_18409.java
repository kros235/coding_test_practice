package etc;

import java.io.*;

public class Q_18409 {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int length      =   Integer.parseInt( br.readLine() );
        String input    =   br.readLine();
        int count       =   0;

        for ( int i = 0 ; i < length ; i++ ){
            String temp = String.valueOf(input.charAt(i));
            if ( temp.equals(String.valueOf('a'))
                    || temp.equals(String.valueOf('e'))
                    || temp.equals(String.valueOf('i'))
                    || temp.equals(String.valueOf('o'))
                    || temp.equals(String.valueOf('u')))
                count++;
        }

        sb.append ( count + "\n" );
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
