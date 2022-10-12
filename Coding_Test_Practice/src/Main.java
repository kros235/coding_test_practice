import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int amount = Integer.parseInt( br.readLine() );

        String[] list = new String[amount];
        for ( int i = 0 ; i < amount ; i++ )
            list[i] = br.readLine();

        Arrays.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                else
                    return o1.length() - o2.length();
            }
        });

        bw.write ( list[0] + "\n");
        for ( int i = 1 ; i < list.length ; i++ )
            if ( !list[i-1].equals(list[i]) )
                bw.write ( list[i] + "\n");


        bw.flush();
        br.close();
        bw.close();
    }
}
