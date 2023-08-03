package etc;

import java.io.*;
import java.util.*;

public class Q_1302 {

    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int book_count  =   Integer.parseInt( br.readLine() );
        Map<String, Integer> sales_count    =   new HashMap<>();



        for ( int i = 0 ; i < book_count ; i++ ){
            String book_name    = br.readLine();
            if (sales_count.containsKey( book_name ) == true ){
                int temp    =   sales_count.get( book_name );
                sales_count.put ( book_name, ( temp + 1) );
            }
            else
                sales_count.put( book_name, 1 );
        }

        LinkedList< Map.Entry<String, Integer> > entryList  =   new LinkedList<>( sales_count.entrySet() );
        Comparator< Map.Entry<String, Integer> > myComparator =   new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        };

        entryList.sort ( myComparator );
        int max = entryList.get(0).getValue();

        ArrayList<String> best_seller_list  =   new ArrayList<>();

        for ( Map.Entry<String, Integer> entry : entryList ){
            if ( entry.getValue() == max )
                best_seller_list.add( entry.getKey() );
        }


        Collections.sort ( best_seller_list );
        sb.append ( best_seller_list.get(0) + "\n");

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
