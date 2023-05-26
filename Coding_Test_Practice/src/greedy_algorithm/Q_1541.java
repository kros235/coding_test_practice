package greedy_algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Q_1541 {
    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String formula  =   br.readLine();
        String[]    minus_tokenized_formula   =   formula.split("-");

        for ( int i = 0 ; i < minus_tokenized_formula.length ; i++ ) {

            if ( minus_tokenized_formula[i].contains("+") == true){
                String[]    plus_tokenized_formula   =   minus_tokenized_formula[i].split("\\+");
                int plus_sum =   0;
                for ( int j = 0 ; j < plus_tokenized_formula.length ; j++ )
                    plus_sum += Integer.parseInt( plus_tokenized_formula[j] );
                minus_tokenized_formula[i] = String.valueOf( plus_sum );
            }
        }

        int minus_sum =   Integer.parseInt( minus_tokenized_formula[0] );
        for ( int i = 1 ; i < minus_tokenized_formula.length ; i++ )
            minus_sum -= Integer.parseInt( minus_tokenized_formula[i] );

        sb.append( minus_sum + "\n" );
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
