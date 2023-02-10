package set_and_map;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q_1620_re {


    // hashmap에 value 로 key 찾기
    public static int getKey(HashMap<Integer, String> map, String name) {

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            if ( value.equals( name ) )
                return key;
        }
        return -1;
    }


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int pokedex_index   =   Integer.parseInt( st.nextToken() );
        int inqueries       =   Integer.parseInt( st.nextToken() );

        HashMap<Integer, String> pokedex            =   new HashMap<>();
        HashMap<String, Integer> pokedex_reverse    =   new HashMap<>();

        // input
        for (int i = 1; i <= pokedex_index; i++) {
            String input    =   br.readLine();
            pokedex.put( i, input );
            pokedex_reverse.put ( input, i );
        }


        // logic
        for (int i = 0; i < inqueries; i++) {
            String inquery  =   br.readLine();
            if ( Character.isDigit( inquery.charAt(0) ) ){
                int index   =   Integer.parseInt( inquery );
                sb.append( pokedex.get( index ) + "\n");
            }
            else{
                sb.append( pokedex_reverse.get( inquery ) + "\n");
            }
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }
}
