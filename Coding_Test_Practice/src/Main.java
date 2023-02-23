import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int a = 1, b = 1;
        while (true){
            String input    =   br.readLine();
            if ( !input.equals("0 0") ){
                StringTokenizer st  =   new StringTokenizer( input );
                a   =   Integer.parseInt( st.nextToken() );
                b   =   Integer.parseInt( st.nextToken() );

                if ( (a < b) && (b % a == 0) )
                    sb.append ( "factor\n" );
                else if ( (a > b) && (a % b == 0) )
                    sb.append ( "multiple\n" );
                else
                    sb.append ( "neither\n" );
            }
            else
                break;
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}


