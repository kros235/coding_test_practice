import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        long A   =   Long.parseLong ( br.readLine() );

        sb.append( (A * 4) );
        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}