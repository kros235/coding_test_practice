import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int current_temp    =   Integer.parseInt( br.readLine() );
        int target_temp     =   Integer.parseInt( br.readLine() );

        int under_zero_time =   Integer.parseInt( br.readLine() );
        int thaw_time       =   Integer.parseInt( br.readLine() );
        int over_zero_time  =   Integer.parseInt( br.readLine() );

        int sum =   0;

        if ( current_temp < 0 )
            sum +=  ( Math.abs(current_temp) * under_zero_time ) + thaw_time + (target_temp * over_zero_time);

        else
            sum +=  ( ( target_temp - current_temp ) * over_zero_time);

        sb.append ( sum + "\n");
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
