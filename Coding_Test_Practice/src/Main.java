import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;

public class Main {

    public static ArrayList<Integer> get_pattern_cycle(int a) {

        ArrayList<Integer> pattern = new ArrayList<>();
        boolean exist_checker = false;

        int remainder;

        for( int i = 1 ; ; i++){

            remainder = (int)Math.pow ( a, i ) % 10;

            for (int j = 0 ; j < pattern.size() ; j++){
                if( pattern.get(j) == remainder) {
                    exist_checker = true;
                    break;
                }
            }

            if (exist_checker == true)
                break;
            else
                pattern.add ( remainder );
        }

        return pattern ;
    }

    public static int check_processed_comNo(int a, int b) {

        ArrayList<Integer> pattern = new ArrayList<>();



        pattern = get_pattern_cycle( a );


        for(int i = 0 ; i < pattern.size() ; i ++)
            System.out.print (pattern.get(i) + " ");
        System.out.print ("\n");

        if( a < 1 || a> 100 || b < 1 || b > 1000000)
            return -1 ;
        else{



                System.out.println ("pattern.size() = " + pattern.size());
                System.out.println ("Return = " + pattern.get( (pattern.size()) - (b % pattern.size()) ) );
                return pattern.get( (pattern.size()) - (b % pattern.size()) ) ;


        }
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String round = br.readLine();
        int a, b;
        int processed_comNo;
        ArrayList<Integer> result = new ArrayList<>();

        for ( int i = 0 ; i < Integer.parseInt( round ) ; i ++ ){
            String input = br.readLine();
            String[] input_digits = input.split(" ");

            a = Integer.parseInt( input_digits[0] );
            b = Integer.parseInt( input_digits[1] );

            processed_comNo = check_processed_comNo( a, b );
            if( processed_comNo != -1  )
                result.add ( processed_comNo );
        }

        for ( int i = 0 ; i < result.size() ; i ++ ) {
            bw.write(String.valueOf(result.get(i)));
            if ( i != result.size() -1 )
                bw.write("\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}