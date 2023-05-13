package etc;

import java.io.*;
import java.util.Stack;

public class Q_4949 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Stack<String> bracket   =   new Stack<>();

        while ( true ){
            String input    =   br.readLine();
            bracket.clear();
            if ( input.equals(".") == true )
                break;
            else{
                for ( int i = 0 ; i < input.length() ; i++ ){
                    String temp =   String.valueOf( input.charAt(i) );
                    if ( temp.equals( String.valueOf( '[' )) || temp.equals( String.valueOf(']'))
                            || temp.equals(String.valueOf('(')) || temp.equals(String.valueOf(')')) ){
                        bracket.push( temp );
                    }
                }
            }
            boolean result  =   check_equality ( bracket );
            if ( result == true )
                sb.append ( "yes\n" );
            else
                sb.append ( "no\n" );
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

    private static boolean check_equality(Stack<String> bracket) {
        Stack<String> closure_bracket   =   new Stack<>();

        int size    =   bracket.size();
        for ( int i = 0 ; i < size ; i++ ){
            String  temp    =   bracket.pop();

            if ( temp.equals( String.valueOf(']')) || temp.equals( String.valueOf(')')) )
                closure_bracket.push( temp );
            else{
                if ( closure_bracket.size() > 0 ) {
                    String latest_closure_bracket = closure_bracket.peek();
                    if (temp.equals(String.valueOf('[')) && latest_closure_bracket.equals(String.valueOf(']')))
                        closure_bracket.pop();
                    else if (temp.equals(String.valueOf('(')) && latest_closure_bracket.equals(String.valueOf(')')))
                        closure_bracket.pop();
                    else
                        return false;
                }
                else
                    return false;
            }
        }

        if ( closure_bracket.size() == 0 )
            return true;
        else
            return false;
    }
}
