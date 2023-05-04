package etc;

import java.io.*;

public class Q_9656 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        int stone_amount = Integer.parseInt(br.readLine());


        for (int i = 0; ; i++) {
            int target = stone_amount - 1;
            if (target <= 0) {
                if ((i - 1) % 2 == 0)
                    sb.append("SK");
                else
                    sb.append("CY");
                break;
            } else {
                if (target >= 3) {
                    stone_amount -= 3;
                    /*if ( i % 2 == 0 )
                        sb.append("SK : ");
                    else
                        sb.append("CY : ");
                    sb.append("Stone -3, : " + stone_amount + "\n");*/
                } else {
                    stone_amount -= 1;
                    /*if ( i % 2 == 0 )
                        sb.append("SK : ");
                    else
                        sb.append("CY : ");
                    sb.append("Stone -1, : " + stone_amount + "\n");*/
                }
            }

        }
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
