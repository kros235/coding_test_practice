package etc;

import java.io.*;

public class Q_4659 {

     public static void main(String args[]) throws IOException {

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         StringBuilder sb = new StringBuilder();

         while ( true ){
             String password =   br.readLine();

             if ( password.equals("end") )
                 break;
             else {
                 if ( password.contains("a") || password.contains("e") ||
                         password.contains("i") || password.contains("o") || password.contains("u") ){


                     boolean vowel_consonant_pass_checker    =   true;
                     int vowel_counter   =   0, consonant_counter    =   0;
                     for ( int i = 0 ; i < password.length() ; i++ ){
                         if ( String.valueOf( password.charAt(i) ).equals("a")
                                 || String.valueOf( password.charAt(i) ).equals("e")
                                 || String.valueOf( password.charAt(i) ).equals("i")
                                 || String.valueOf( password.charAt(i) ).equals("o")
                                 || String.valueOf( password.charAt(i) ).equals("u") ) {
                             consonant_counter = 0;
                             vowel_counter++;
                         }
                         else{
                             vowel_counter = 0;
                             consonant_counter++;
                         }

                         if ( vowel_counter >= 3 || consonant_counter >= 3){
                             sb.append("<" + password + "> is not acceptable.\n");
                             vowel_consonant_pass_checker    =   false;
                             break;
                         }
                     }

                     if ( vowel_consonant_pass_checker == true ){

                         boolean consequtive_duplication_checker    =   true;
                         for ( int i = 1 ; i < password.length() ; i++ ){
                             int j   =   i - 1;
                             if ( (!String.valueOf( password.charAt(i) ).equals("e") && !String.valueOf( password.charAt(j) ).equals("e") )
                                     && (!String.valueOf( password.charAt(i) ).equals("o") && !String.valueOf( password.charAt(j) ).equals("o") ) ){
                                 ;                                   if ( String.valueOf( password.charAt(i) ).equals( String.valueOf( password.charAt(j) ) ) ){
                                     sb.append("<" + password + "> is not acceptable.\n");
                                     consequtive_duplication_checker =   false;
                                     break;
                                 }
                             }

                             if ( consequtive_duplication_checker == false )
                                 break;
                         }
                         if ( consequtive_duplication_checker == true )
                             sb.append("<" + password + "> is acceptable.\n");
                     }
                 }
                 else
                     sb.append("<" + password + "> is not acceptable.\n");


             }
         }

         bw.write(sb.toString());
         bw.flush();
         br.close();
         bw.close();
    }

}
