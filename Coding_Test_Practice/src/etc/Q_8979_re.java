package etc;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q_8979_re {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer(br.readLine());
        int country_count   =   Integer.parseInt(st.nextToken());
        int target_country  =   Integer.parseInt(st.nextToken());

        country[] list = new country[ country_count ];
        for ( int i  = 0 ; i < country_count ; i++ ){
            st  =   new StringTokenizer(br.readLine());
            int country_code    =   Integer.parseInt( st.nextToken() );
            int gold_medal    =   Integer.parseInt( st.nextToken() );
            int silver_medal    =   Integer.parseInt( st.nextToken() );
            int bronze_medal    =   Integer.parseInt( st.nextToken() );
            list[i] =   new country( country_code, gold_medal, silver_medal, bronze_medal, -1 );
        }

        Comparator<country> myComparator    =   new Comparator<country>() {
            @Override
            public int compare(country o1, country o2) {
                if ( o1.gold_medal < o2.gold_medal )
                    return 1;
                else if ( o1.gold_medal == o2.gold_medal ){
                    if ( o1.silver_medal < o2.silver_medal )
                        return 1;
                    else if ( o1.silver_medal == o2.silver_medal ) {
                        if ( o1.bronze_medal < o2.bronze_medal ){
                            return 1;
                        }
                        else if(o1.bronze_medal==o2.bronze_medal){
                            if(o1.country_code>o2.country_code){ // 모두 같은 경우에는 국가를 나타내는 정수를 오름차순으로 정렬
                                return 1;
                            }
                        }
                    }
                }
                return -1;
            }
        };

        Arrays.sort ( list, myComparator );
        int rank    =   1;
        list[0].rank    =   rank;
        int equal_count =   1;

        for ( int i = 1 ; i < list.length ; i++ ){

            if ( list[i-1].gold_medal   ==   list[i].gold_medal
                    && list[i-1].silver_medal   ==   list[i].silver_medal
                    && list[i-1].bronze_medal   ==   list[i].bronze_medal
            ) {
                list[i].rank = rank;
                equal_count++;
            }
            else {
                list[i].rank = rank + equal_count;
                rank    +=  equal_count;
                equal_count =   1;
            }
        }


        for ( int i = 0 ; i < list.length ; i++ ){
            if ( list[i].country_code == target_country )
                sb.append(list[i].rank + "\n");
        }


        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }



    public static class country{
        int country_code;
        int gold_medal;
        int silver_medal;
        int bronze_medal;
        int rank;

        public country( int country_code, int gold_medal, int silver_medal, int bronze_medal, int rank){
            this.country_code   =   country_code;
            this.gold_medal     =   gold_medal;
            this.silver_medal   =   silver_medal;
            this.bronze_medal   =   bronze_medal;
            this.rank   =   rank;
        }
    }



}
