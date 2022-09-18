package etc;

import java.io.*;

public class Q_1264 {

    public static int get_vowel_count(String input){
        int count = 0;
        for ( int i = 0 ; i < input.length() ; i++ ){
            switch ( input.charAt(i) ){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': {
                    count++;
                    break;
                }
                default:
                    break;
            }
        }
        return count;
    }
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String input = br.readLine();

            if ( input.length() == 1 && input.charAt(0) == '#')
                break;
            else {
                int result = get_vowel_count(input);
                bw.write(String.valueOf(result) + "\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();

    }

}
