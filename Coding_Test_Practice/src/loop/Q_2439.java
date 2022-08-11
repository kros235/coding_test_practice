package loop;

import java.io.*;

public class Q_2439 {
    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int round = Integer.parseInt(input);

        if(round < 1 || round > 100){}
        else{
            for(int i = 1 ; i<= round ; i++){
                for (int j = round - i; j> 0 ; j--){
                    bw.write(" ");
                }
                for (int k = 0; k< i ; k++){
                    bw.write("*");
                }
                bw.newLine();
            }
            bw.flush();
            bw.close();
        }

    }
}
