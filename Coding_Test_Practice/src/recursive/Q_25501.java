package recursive;

import java.io.*;
import java.util.ArrayList;

public class Q_25501 {

    static int counter = 0;

    public static int recursion(String s, int l, int r){
        counter ++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int amount = Integer.parseInt( br.readLine() );

        if ( amount >= 1 && amount <= 1000){

            ArrayList<String> word_list = new ArrayList<>();

            for ( int i = 0 ; i < amount ; i++ )
                word_list.add( br.readLine() );

            for ( int i = 0 ; i < amount ; i++ ) {
                bw.write(isPalindrome(word_list.get(i)) + " " + counter + "\n");
                counter = 0;
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }

}
