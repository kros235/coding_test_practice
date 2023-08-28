
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String input    =   br.readLine();

        if ( String.valueOf( input ).equals("N") ||  String.valueOf( input ).equals("n") )
            sb.append ("Naver D2\n");
        else
            sb.append ( "Naver Whale\n");


        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}