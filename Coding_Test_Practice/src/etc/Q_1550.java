package etc;

import java.io.*;
import java.math.BigInteger;

public class Q_1550 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        String input    =   br.readLine();
        long sum  =   0;

        for ( int i = input.length()-1 ; i >= 0 ; i-- ){
            switch ( input.charAt(i) ){
                case 'A':{
                    sum += 10 * Math.pow(16, (input.length()-1) - i);
                    break;
                }
                case 'B':{
                    sum += 11 * Math.pow(16, (input.length()-1) - i);
                    break;
                }
                case 'C':{
                    sum += 12 * Math.pow(16, (input.length()-1) - i);
                    break;
                }
                case 'D':{
                    sum += 13 * Math.pow(16, (input.length()-1) - i);
                    break;
                }
                case 'E':{
                    sum += 14 * Math.pow(16, (input.length()-1) - i);
                    break;
                }
                case 'F':{
                    sum += 15 * Math.pow(16, (input.length()-1) - i  );
                    break;
                }
                default:{
                    sum += Integer.parseInt( String.valueOf( input.charAt(i) ) ) * Math.pow(16, (input.length()-1) - i);
                    break;
                }
            }
        }

        sb.append( sum );
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
