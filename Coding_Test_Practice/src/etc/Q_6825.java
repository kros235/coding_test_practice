package etc;

import java.io.*;

public class Q_6825 {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        double weight    =   Double.parseDouble( br.readLine() );
        double height    =   Double.parseDouble( br.readLine() );

        double bmi    =   weight / ( Math.pow( height, 2 ) );

        if ( bmi > 25 )
            sb.append("Overweight");
        else if ( bmi >= 18.5 && bmi <= 25 )
            sb.append("Normal weight");
        else
            sb.append("Underweight");

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
