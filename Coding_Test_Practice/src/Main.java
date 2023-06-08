import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        long round  =   Integer.parseInt( br.readLine() );

        for (int i = 0 ; i < round ; i++) {
            StringTokenizer st  =   new StringTokenizer(br.readLine());
            long candy          =   Long.parseLong( st.nextToken() );
            int  boxes          =   Integer.parseInt( st.nextToken() );
            int[] box_size      =   new int[ boxes ];

            for (int j = 0 ; j < boxes ; j++) {
                st  =   new StringTokenizer(br.readLine());
                int  width          =   Integer.parseInt( st.nextToken() );
                int  height         =   Integer.parseInt( st.nextToken() );

                box_size[j]         =   width * height;
            }
            Arrays.sort ( box_size );

            int count   =   0;
            for (int j = boxes-1 ; j >= 0 ; j--) {
                if ( candy <= 0 )
                     break;
                else {
                    candy -= box_size[j];
                    count++;
                }
            }
            sb.append ( count + "\n" );
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
