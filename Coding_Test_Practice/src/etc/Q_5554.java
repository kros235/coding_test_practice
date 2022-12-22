package etc;

import java.io.*;

public class Q_5554 {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int home_to_school       =   Integer.parseInt( br.readLine() );
        int school_to_gameCafe   =   Integer.parseInt( br.readLine() );
        int gameCafe_to_academy  =   Integer.parseInt( br.readLine() );
        int academy_to_home      =   Integer.parseInt( br.readLine() );

        int sum =   home_to_school + school_to_gameCafe + gameCafe_to_academy + academy_to_home;

        sb.append( (sum/60) + "\n");
        sb.append( (sum%60) + "\n");

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();

    }

}
