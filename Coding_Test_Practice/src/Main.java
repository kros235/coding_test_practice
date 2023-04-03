import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();



        StringTokenizer st    =   new StringTokenizer( br.readLine() );
        String line           =   st.nextToken();
        int    num            =   Integer.parseInt( st.nextToken() );
        long sum              =   0;

        int count             =   0;
        for ( int i = line.length()-1 ; i >=0 ; i-- ){
            if ( line.charAt(i) >= 65 &&  line.charAt(i) <= 90){
                int temp    =   line.charAt(i) - 55;
                sum        +=   temp * Math.pow( num, count++);
            }
            else {
                int temp = line.charAt(i) - 48;
                sum        +=   temp * Math.pow( num, count++);
            }
        }

        sb.append( sum );
        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();

    }
}
