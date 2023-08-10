package greedy_algorithm;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q_13305 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int city_count = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Long> distance = new ArrayList<>();
        for (int i = 0; i < city_count - 1; i++)
            distance.add(Long.parseLong(st.nextToken()));

        st = new StringTokenizer(br.readLine());
        ArrayList<Long> oil_price = new ArrayList<>();
        for (int i = 0; i < city_count - 1; i++)
            oil_price.add(Long.parseLong(st.nextToken()));


        long price  =   0;
        for (int i = 0; i < city_count - 1; i++){

            int how_far_index   =   measure_oil_price ( oil_price, i, oil_price.get(i) );

            if ( how_far_index == 0 ) {
                price += oil_price.get(i) * get_distance_sum(distance, i, distance.size());
                i   =   distance.size();
            }
            else {
                price += oil_price.get(i) * get_distance_sum(distance, i, how_far_index);
                i = how_far_index - 1;
            }
        }





        sb.append ( price + "\n" );
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

    private static int measure_oil_price(ArrayList<Long> oil_price, int start_city_index, long current_oil_price) {

        for ( int i = start_city_index ; i < oil_price.size() ; i++ )
            if ( oil_price.get(i) < current_oil_price )
                return i;

        return 0;
    }


    private static long get_distance_sum(ArrayList<Long> distance, int start_city_index, int how_far_index) {
        long distance_sum    =   0;

        for ( int i = start_city_index ; i < how_far_index ; i++ )
            distance_sum    +=  distance.get(i);

        return distance_sum;
    }
}
