import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringBuilder sb    =   new StringBuilder();
        int number_count    =   Integer.parseInt( br.readLine() );
        int[] numbers       =   new int[number_count];

        StringTokenizer st  =   new StringTokenizer( br.readLine() );

        for (int i = 0; i < number_count; i++)
            numbers[i]  =   Integer.parseInt(st.nextToken());

        Arrays.sort ( numbers );

        int count = 0;
        for (int i = 0; i < number_count ; i++) {

            for ( int j = 0 ; j < number_count ; j++){
                boolean checker = false;
                if ( j == i ) continue;
                if (numbers[i] - numbers[j] <= 0 ) break;
                for ( int k = j+1 ; k < number_count ; k++) {
                    if ( k == i ) continue;
                    if (numbers[i] - (numbers[j] + numbers[k]) < 0 )
                        break;
                    else{
                        if (numbers[i] - numbers[j] == numbers[k]) {
                            count++;
                            checker = true;
                            break;
                        }
                    }
                }
                if (checker == true) break;
            }
        }


        bw.write( String.valueOf( count ) );

        bw.flush();
        br.close();
        bw.close();

    }
}

