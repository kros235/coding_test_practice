package etc;

import java.io.*;

public class Q_2577 {

    public static int[] find_number_usage(String[] digits){
        int[] usage = new int[10];

        long a, b, c;
        long multiplication;
        a   =   Long.parseLong( digits[0] );
        b   =   Long.parseLong( digits[1] );
        c   =   Long.parseLong( digits[2] );


        multiplication = a * b * c;
        String result_string = String.valueOf( multiplication );

        for ( int i = 0 ; i < result_string.length() ; i++) {

            switch (Integer.parseInt( String.valueOf( result_string.charAt(i) ) ) ){
                case 0:{
                    usage [ 0 ] ++;
                    break;
                }
                case 1:{
                    usage [ 1 ] ++;
                    break;
                }
                case 2:{
                    usage [ 2 ] ++;
                    break;
                }
                case 3:{
                    usage [ 3 ] ++;
                    break;
                }
                case 4:{
                    usage [ 4 ] ++;
                    break;
                }
                case 5:{
                    usage [ 5 ] ++;
                    break;
                }
                case 6:{
                    usage [ 6 ] ++;
                    break;
                }
                case 7:{
                    usage [ 7 ] ++;
                    break;
                }
                case 8:{
                    usage [ 8 ] ++;
                    break;
                }
                default:{
                    usage [ 9 ] ++;
                    break;
                }

            }
        }


        return usage;
    }


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] digits = new String[3];
        for (int i = 0; i < 3; i++){
            String input = br.readLine();
            digits[i] = input;
        }
        int[] usage = new int[10];

        if( Integer.parseInt( digits[0]) < 100 || Integer.parseInt( digits[0]) > 1000
                || Integer.parseInt( digits[1]) < 100 || Integer.parseInt( digits[1]) > 1000
                || Integer.parseInt( digits[2]) < 100 || Integer.parseInt( digits[2]) > 1000){
        }
        else{
            usage = find_number_usage( digits );

            for( int i = 0 ; i < usage.length ; i ++ )
                bw.write( String.valueOf( usage[i] ) + "\n" );
        }
        bw.flush();
        bw.close();
        br.close();

    }

}
