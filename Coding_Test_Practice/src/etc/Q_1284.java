package etc;

import java.io.*;

public class Q_1284 {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        while (true){
            String input    =   br.readLine();
            int space_count =   2;
            if ( !input.equals( "0" ) ){
                space_count += input.length() - 1;

                for (int i = 0; i < input.length() ; i++){
                    switch( String.valueOf( input.charAt(i) ) ){
                        case "0":{
                            space_count += 4;
                            break;
                        }
                        case "1":{
                            space_count += 2;
                            break;
                        }
                        default:{
                            space_count += 3;
                            break;
                        }
                    }
                }

                sb.append ( space_count + "\n" );
            }
            else
                break;
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }
}
