package etc;

import java.io.*;

public class Q_5532 {


    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringBuilder sb     =   new StringBuilder();

        int vacation_days    =   Integer.parseInt( br.readLine() );
        int language_pages   =   Integer.parseInt( br.readLine() );
        int math_pages       =   Integer.parseInt( br.readLine() );
        int language_ability =   Integer.parseInt( br.readLine() );
        int math_ability     =   Integer.parseInt( br.readLine() );

        int language_consumption_days, math_consumption_days;

        // =================
        // calculation
        // =================
        if ( language_pages % language_ability == 0 )
            language_consumption_days = language_pages / language_ability;
        else
            language_consumption_days = (language_pages / language_ability) + 1;

        if ( math_pages % math_ability == 0 )
            math_consumption_days = math_pages / math_ability;
        else
            math_consumption_days = (math_pages / math_ability) + 1;


        // =================
        // print
        // =================
        if ( math_consumption_days >= language_consumption_days)
            sb.append ( vacation_days - math_consumption_days );
        else
            sb.append ( vacation_days - language_consumption_days );

        bw.write( String.valueOf( sb ) );

        bw.flush();
        br.close();
        bw.close();
    }

}
