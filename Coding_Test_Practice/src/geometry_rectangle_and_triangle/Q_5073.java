package geometry_rectangle_and_triangle;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_5073 {



    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while( true ){
            String input  =   br.readLine();

            if ( input.equals("0 0 0") == true )
                break;

            else{
                StringTokenizer st  =   new StringTokenizer( input );

                int[] lines   =   new int[3];
                for ( int i = 0 ; i < 3 ; i++ )
                    lines[i]   =   Integer.parseInt( st.nextToken() );
                Arrays.sort ( lines);

                if ( lines[2] >= ( lines[0] + lines[1] ) )
                    sb.append("Invalid\n");
                else {

                    if (lines[0] == lines[1] && lines[0] == lines[2] && lines[1] == lines[2])
                        sb.append("Equilateral\n");
                    else if (lines[0] != lines[1] && lines[0] != lines[2] && lines[1] != lines[2])
                        sb.append("Scalene\n");
                    else
                        sb.append("Isosceles\n");
                }
            }
        }

        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

}
