package binary_search;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q_10816 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        HashMap< Integer, Integer > card_deck = new HashMap<>();
        int card_amount    =   Integer.parseInt( br.readLine() );
        StringTokenizer st =   new StringTokenizer( br.readLine() );

        for( int i = 0 ; i < card_amount ; i++ ){
            int temp    =   Integer.parseInt( st.nextToken() );
            if ( card_deck.containsKey( temp ) == false )
                card_deck.put( temp, 1 );
            else{
                int value   =   card_deck.get(temp);
                card_deck.put( temp, value + 1 );
            }
        }

        int find_amount    =   Integer.parseInt( br.readLine() );
        st =   new StringTokenizer( br.readLine() );
        for( int i = 0 ; i < find_amount ; i++ ){

            int temp    =   Integer.parseInt( st.nextToken() );

            if ( card_deck.containsKey( temp ) == false )
                sb.append ( "0 ");
            else {
                int value = card_deck.get(temp);
                sb.append(value + " ");
            }
        }

        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

}
