package string;

import java.io.*;

public class Q_5622 {

    public static int find_time_consumption(char input) {

        if ( input == 'A' || input == 'B' || input == 'C')
            return 3;

        else if ( input == 'D' || input == 'E' || input == 'F')
            return 4;

        else if ( input == 'G' || input == 'H' || input == 'I')
            return 5;

        else if ( input == 'J' || input == 'K' || input == 'L')
            return 6;

        else if ( input == 'M' || input == 'N' || input == 'O')
            return 7;

        else if ( input == 'P' || input == 'Q' || input == 'R' || input == 'S')
            return 8;

        else if ( input == 'T' || input == 'U' || input == 'V')
            return 9;

        else if ( input == 'W' || input == 'X' || input == 'Y' || input == 'Z')
            return 10;

        else if ( input == '+' || input == '-' || input == '*' || input == '/' || input == '#')
            return 10;

        else    //  when user pressed '1'
            return 2;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder input = new StringBuilder(br.readLine());

        int total_time_consumption = 0;


        if (input.length() < 2 || input.length() > 15) {
        } else {

            for (int i = 0; i < input.length(); i++)
                total_time_consumption += find_time_consumption(input.charAt(i));


            bw.write(String.valueOf(total_time_consumption));
            bw.flush();
        }
        br.close();
        bw.close();
    }

}
