import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        String score_list_amount = br.readLine();
        boolean valid_checker = true;
        int continuous_counter;

        for(int i = 0 ; i < Integer.parseInt(score_list_amount) ; i++){
            String result = br.readLine();
            if(result.length() < 0 || result.length() > 80)
                valid_checker = false;
            else{
                continuous_counter = 0;

            }
        }


        bw.flush();
        br.close();
        bw.close();
    }
}