package etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_28353 {

     public static void main(String args[]) throws IOException {


         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         StringBuilder sb = new StringBuilder();

         StringTokenizer st  =   new StringTokenizer( br.readLine() );
         long cat_count      =   Long.parseLong( st.nextToken() );
         long weight         =   Long.parseLong( st.nextToken() );

         long[] cats         =   new long[ (int) cat_count ];
         st                  =   new StringTokenizer( br.readLine() );
         int count           =   st.countTokens();
         for (int i = 0; i < count ; i++)
             cats[i] = Long.parseLong( st.nextToken() );

         Arrays.sort( cats );

         int start           =   0;
         int end             =   cats.length - 1;

         int answer          =   0;
         while ( start < end ){

             if ( cats[ start ] + cats[ end ] <= weight ) {
                 answer++;
                 start++;
                 end--;
             }
             else
                 end--;
         }

         sb.append(answer + "\n");
         bw.write(sb.toString());
         br.close();
         bw.close();
    }

}
