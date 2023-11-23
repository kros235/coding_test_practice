package etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_1049 {

    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer(br.readLine());
        int broken_line     =   Integer.parseInt ( st.nextToken() );
        int brands          =   Integer.parseInt ( st.nextToken() );

        int pacakage_min =    1000;
        int single_min =    1000;
        for ( int i = 0 ; i < brands ; i++ ){
            st  =   new StringTokenizer(br.readLine());
            int package_price   =   Integer.parseInt( st.nextToken() );
            int single_price    =   Integer.parseInt( st.nextToken() );

            if ( pacakage_min > package_price )
                pacakage_min    =   package_price;

            if ( single_min > single_price )
                single_min    =   single_price;
        }

        // 끊어진 실 11개라 가정
        // 패키지는 6개씩
        // 패키지 단일 구매시, 2개(12개) 구매로 커버
        // 콤비 구매시 ,      패키지 1개(6개), + 단일 5개 구매로 커버

        int package_amount  =   (int)Math.ceil( broken_line / 6.0 );

        int package_price   =   pacakage_min * package_amount;
        int single_price    =   broken_line  * single_min;

        int combi_price     =   pacakage_min * (int)( broken_line / 6.0 )
                +   ( broken_line - (int)( broken_line / 6.0 ) * 6 ) * single_min;

        int[] prices        =   new int[3];
        prices[0]           =   package_price;
        prices[1]           =   single_price;
        prices[2]           =   combi_price;

        Arrays.sort( prices );


        sb.append ( prices[0] + "\n" );

        bw.write(sb.toString());
        br.close();
        bw.close();
    }

}
