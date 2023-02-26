package set_and_map;

import java.io.*;
import java.util.*;

public class Q_1764 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  =   new StringTokenizer( br.readLine() );
        int unheard         =   Integer.parseInt( st.nextToken() );
        int unseen          =   Integer.parseInt( st.nextToken() );

        HashMap<String, Integer> unheard_list = new HashMap<>();
        ArrayList<String> name_list = new ArrayList<>();
        String[] unseen_list        =   new String[unseen];
        int counter                 =   0;
        for (int i = 0; i < unheard + unseen; i++) {
            String name = br.readLine();

            if (i < unheard)
                unheard_list.put(name, 0);
            else
                unseen_list[counter++]    =   name;
        }

        Arrays.sort( unseen_list );

        for ( int i = 0 ; i <  unseen_list.length ; i++ ) {
            if ( unheard_list.containsKey( unseen_list[i] ) == true )
                name_list.add ( unseen_list[i] );
        }

        sb.append(name_list.size() + "\n");
        for (int i = 0; i < name_list.size() ; i++)
            sb.append(name_list.get(i) + "\n");

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
