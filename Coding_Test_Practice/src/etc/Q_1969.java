package etc;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q_1969 {

    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int count       =   Integer.parseInt( st.nextToken() );
        int length      =   Integer.parseInt( st.nextToken() );
        String[] dna_dictionary =   new String[ count ];


        for ( int i = 0 ; i < count ; i++ )
            dna_dictionary[i]  =   br.readLine();


        int sum =   0;
        for ( int i = 0 ; i < length ; i++ ){
            HashMap<String, Integer> map    =   new HashMap<>();
            for ( int j = 0 ; j < count ; j++ ){
                String snapshot =   String.valueOf( dna_dictionary[j].charAt(i) );
                if ( map.containsKey( snapshot ) )
                    map.put ( snapshot, map.get(snapshot) +  1 );
                else
                    map.put ( snapshot, 1 );
            }

            // find max frequency
            int max =   -1;
            for (Map.Entry<String, Integer> entrySet : map.entrySet() ){
                if ( entrySet.getValue() > max )
                    max =   entrySet.getValue();
            }

            // find min text
            String temp =   null;
            for (Map.Entry<String, Integer> entrySet : map.entrySet() ){
                if ( entrySet.getValue() == max ) {
                    if ( temp   ==  null )
                        temp = entrySet.getKey();
                    else{
                        if ( (int)temp.charAt(0) < (int)entrySet.getKey().charAt(0) )
                            continue;
                        else
                            temp    =   entrySet.getKey();
                    }

                }
            }

            sb.append ( temp );
            sum +=  count - max;
        }

        sb.append ( "\n" + sum + "\n" );
        bw.write(sb.toString());
        br.close();
        bw.close();
    }

}
