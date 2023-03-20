package geometry_rectangle_and_triangle;

import java.io.*;
import java.util.Arrays;

public class Q_27323 {


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int A   =   Integer.parseInt ( br.readLine() );
        int B   =   Integer.parseInt ( br.readLine() );


        sb.append( A * B + "\n");
        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
