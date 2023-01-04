package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_1252 {

    public static String cut_first_zeros(String number1) {

        while (String.valueOf( number1.charAt(0) ).equals("0") == true ){

            number1 = number1.substring(1, number1.length());
            if ( number1.length() == 0 ) break;
        }

        if (number1.length() == 0)
            return "0";
        else
            return number1;

    }

    public static String binary_sum(String number1, String number2) {


        String number1_part1, number1_part2;

        number1_part1   =   number1.substring(0, number1.length() - number2.length()  );
        number1_part2   =   number1.substring( number1.length() - number2.length() , number1.length() );

        String result   =   "";
        int addition    =   0;

        for (int i = number1_part2.length()-1 ; i >= 0 ; i-- ){

            int temp = Integer.parseInt( String.valueOf( number1_part2.charAt(i) ) ) +  Integer.parseInt( String.valueOf( number2.charAt(i) ) );

            if ( temp + addition  > 2){
                addition = 1;
                result = "1" + result;
            }

            else if ( temp + addition  == 2){
                addition = 1;
                result = "0" + result;
            }

            else if ( temp + addition == 1) {
                addition = 0;
                result = "1" + result;
            }

            else {
                addition = 0;
                result = "0" + result;
            }
        }




        for (int i = number1_part1.length()-1 ; i >= 0 ; i-- ){


            // addition + number1_part1

            int temp = Integer.parseInt(String.valueOf(number1_part1.charAt(i)));

            if (temp + addition > 2) {
                addition = 1;
                result = "1" + result;
            }

            else if (temp + addition == 2) {
                addition = 1;
                result = "0" + result;
            } else if (temp + addition == 1) {
                addition = 0;
                result = "1" + result;
            } else {
                addition = 0;
                result = "0" + result;
            }

        }
        if (addition == 1)
            result = "1" + result;

        return cut_first_zeros(result);
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String first = st.nextToken();
        String second = st.nextToken();

        StringBuilder sb = new StringBuilder();

        if ( first.length() > second.length() )
            sb.append(binary_sum ( first, second ) + "\n");
        else
            sb.append(binary_sum ( second, first ) + "\n");

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }
}
