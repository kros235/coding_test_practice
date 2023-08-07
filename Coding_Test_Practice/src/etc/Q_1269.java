package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q_1269 {

    static Map<String, Integer> components =   new HashMap<>();

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        long size_A         =   Long.parseLong( st.nextToken() );
        long size_B         =   Long.parseLong( st.nextToken() );

        st  =   new StringTokenizer( br.readLine() );
        put_in_map ( size_A, st );

        st  =   new StringTokenizer( br.readLine() );
        put_in_map ( size_B, st );

        int mutual_component_count  =   0;
        for (Map.Entry<String, Integer> entrySet : components.entrySet() ){
            if ( entrySet.getValue() == 2 )
                mutual_component_count++;
        }

        sb.append ( ( size_A - mutual_component_count ) + ( size_B - mutual_component_count ) + "\n");

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();

    }

    private static void put_in_map(long size, StringTokenizer st) {

        for ( int i = 0 ; i < size ; i++ ){
            String value    =   st.nextToken();
            if ( components.containsKey(value) ){
                int counter =   components.get(value);
                components.put( value, counter + 1 );
            }
            else
                components.put( value, 1 );
        }
    }

}
