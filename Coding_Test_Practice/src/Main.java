import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int input = Integer.parseInt(br.readLine());

        sb.append( (input + 1) * 2 + " " + (input +1) * 3 );

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}

