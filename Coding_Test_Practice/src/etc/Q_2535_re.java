package etc;

import java.io.*;
import java.util.*;

public class Q_2535_re {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int medalist_count = 0;
        int student_amount = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> nation_count_map = new HashMap<>();



        // ============================================================
        // input
        // ============================================================
        for (int i = 0; i < student_amount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String nation_code  = st.nextToken();
            String student_code  = st.nextToken();
            map.put(nation_code + " " + student_code , Integer.parseInt( st.nextToken() ) );

            nation_count_map.put( nation_code, 0 );
        }

        // ============================================================
        // sort
        // ============================================================
        List<Map.Entry<String, Integer>> entryList   =  new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });


        // ============================================================
        // logic function
        // ============================================================

        for(Map.Entry<String, Integer> entry : entryList) {
            //System.out.println(entry.getKey() + " : " + entry.getValue());

            StringTokenizer st = new StringTokenizer( entry.getKey() );

            String nation_code  =   st.nextToken() ;
            String student_code  =   st.nextToken() ;

            if ( nation_count_map.get( nation_code ) < 2 && medalist_count < 3) {
                sb.append ( nation_code + " " + student_code + "\n");
                nation_count_map.put ( nation_code, nation_count_map.get(nation_code) + 1 );
                medalist_count++;
            }
            else
                continue;
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
