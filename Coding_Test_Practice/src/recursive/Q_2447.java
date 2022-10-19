package recursive;

import java.io.*;
import java.util.ArrayList;

public class Q_2447 {


    static ArrayList<Integer> fibonacci = new ArrayList<>();

    public static int get_fibonacci(int n) {

        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        return get_fibonacci(n-2) + get_fibonacci(n-1);

    }


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int round = Integer.parseInt(br.readLine());
        fibonacci.add(0);
        fibonacci.add(1);

        if ( round < 0 || round > 20 ){}
        else {

            if ( round == 0 )
                bw.write(String.valueOf( get_fibonacci(0) ) + "\n");
            else if ( round == 1 )
                bw.write(String.valueOf( get_fibonacci(1) ) + "\n");
            else
                bw.write(String.valueOf( get_fibonacci(round) ) + "\n");

        }
        bw.flush();
        br.close();
        bw.close();
    }

}
