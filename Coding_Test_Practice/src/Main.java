import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int round    =   Integer.parseInt( br.readLine() );
        int squares  =   (int) Math.sqrt( Math.pow( 4, round ) );
        int dots     =   (int) Math.pow ( squares + 1 , 2 );
        sb.append( dots );


        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();

    }
}
