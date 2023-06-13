package set_and_map;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q_7785 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int log_count   =   Integer.parseInt( br.readLine() );
        HashMap<String, String> employee  =   new HashMap<>();

        for ( int i = 0 ; i < log_count ; i++ ){
            StringTokenizer st  =   new StringTokenizer( br.readLine() );
            String name         =   st.nextToken();
            String existence    =   st.nextToken();

            if ( existence.equals("enter") )
                employee.put( name, existence );
            else
                employee.remove( name );
        }

        String[] name   =   new String[ employee.size() ];
        int count       =   0;
        for ( Map.Entry<String, String> entrySet : employee.entrySet() )
            name[count++]   =   entrySet.getKey();
        Arrays.sort ( name );


        for ( int i = employee.size()-1 ; i >= 0 ; i-- )
            sb.append ( name[i] + "\n");

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
