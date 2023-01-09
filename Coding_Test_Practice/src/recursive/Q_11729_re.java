package recursive;

import java.io.*;

public class Q_11729_re {

    static StringBuilder sb = new StringBuilder();

    public static void move_disks_process( int disks , int start, int middle, int end){

        if ( disks == 1 )
            sb.append(start + " " + end + "\n");
        else{

            move_disks_process( disks - 1 , start, end, middle);

            sb.append(start + " " + end + "\n");

            move_disks_process( disks - 1 , middle, start, end);
        }

    }

    public static int move_disks( int disks ){

        if ( disks == 1 )
            return 1;
        else
            return (int) (Math.pow(2 , disks - 1) + move_disks( (disks-1) ));
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int disks = Integer.parseInt(br.readLine());

        sb.append( move_disks( disks ) + "\n");

        move_disks_process ( disks, 1, 2, 3);
        // 1 2 3



        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
