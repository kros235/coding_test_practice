package etc;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q_11899 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int opener_count = 0;
        int closure_count = 0;
        String input = br.readLine();
        Stack<String> st = new Stack<>();

        for (int i = 0; i < input.length(); i++)
            st.push(String.valueOf(input.charAt(i)));


        while (st.isEmpty() != true) {
            String temp = st.pop();
            if (temp.equals(String.valueOf(')')) == true) {
                closure_count++;
            } else {

                if ( closure_count > 0 )
                    closure_count--;
                else
                    opener_count++;
            }
        }

        sb.append( (opener_count + closure_count) );
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
