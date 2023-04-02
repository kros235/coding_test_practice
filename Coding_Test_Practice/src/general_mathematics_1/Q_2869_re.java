package general_mathematics_1;

import java.io.*;

public class Q_2869_re {
    public static long calculate_days( long arise, long fall, long height){
        long day = (height - fall) / (arise - fall);

        if ( (height - fall) % (arise - fall) != 0 )
            day ++ ;

        return day;
    }


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String[] parsed_iput = input.split(" ");

        long arise  = Long.parseLong( parsed_iput[0]);
        long fall   = Long.parseLong( parsed_iput[1]);
        long height = Long.parseLong( parsed_iput[2]);

        if ( arise < 0 || fall < 0 || height < 0
                || arise > 1000000000 || fall > 1000000000 || height > 1000000000){}
        else {
            long result_day = calculate_days(arise, fall, height);
            bw.write( String.valueOf( result_day ) );
        }
        bw.flush();
        br.close();
        bw.close();

    }
}
