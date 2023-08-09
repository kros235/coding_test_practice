package etc;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Q_10546 {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int runner_count                =   Integer.parseInt( br.readLine() );
        Map<String, Integer> runner     =   new HashMap();


        for ( int i = 0 ; i < runner_count ; i++ ) {
            String name =   br.readLine();
            if ( runner.containsKey( name ) )
                runner.put( name, runner.get( name ) + 1 );
            else
                runner.put( name, 1 );
        }

        for ( int i = 0 ; i < runner_count - 1 ; i++ ) {
            String finisher_name =   br.readLine();
            runner.put( finisher_name, runner.get( finisher_name ) - 1 );
        }

        for (Map.Entry<String, Integer> entrySet : runner.entrySet() ){
            if ( entrySet.getValue() != 0 )
                sb.append( entrySet.getKey() + "\n" );
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
