package string;

import java.io.*;
import java.util.ArrayList;

public class Q_2675 {

    public static String generate_new_line(int repeat_count, String input_line) {

        String new_line = "";

        for ( int i = 0 ; i < input_line.length() ; i++ ){
            char partial = input_line.charAt(i);

            for ( int j = 0; j < repeat_count ; j++ )
                new_line += partial;
        }
        return new_line;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int round_count = Integer.parseInt(input);

        ArrayList<String> new_line_output = new ArrayList<>();

        if (round_count < 1 || round_count > 1000) {
        } else {
            for (int i = 0; i < round_count; i++){
                input = br.readLine();
                String[] contents = input.split(" ");
                new_line_output.add( generate_new_line(Integer.parseInt( contents[0]) , contents[1]) );
            }

            for (int i = 0; i < new_line_output.size(); i++)
                bw.write(new_line_output.get(i) + "\n");
            bw.flush();
        }
        br.close();
        bw.close();
    }

}
