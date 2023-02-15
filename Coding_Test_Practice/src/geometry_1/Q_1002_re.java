package geometry_1;

import java.io.*;
import java.util.StringTokenizer;

public class Q_1002_re {

    public static long check_crossed_range_points(long x1, long y1, long r1, long x2, long y2, long r2) {


        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        // 포함, 내접, 일치, 복수 교점 발생
        // case #1, #3, #5, #6, #7


        // case #7
        if (distance == 0 && (r1 == r2))
            return -1;


            // case #1
        else if (Math.abs(r1 - r2) < distance && Math.abs(r1 + r2) > distance)
            return 2;



            // case #3
        else if (Math.abs(r1 - r2) == distance)
            return 1;

            // case #2, 외접, 외부 접점 1개
        else if (distance == (r1 + r2))
            return 1;



            // case #6
        else if (Math.abs(r1 - r2) > distance)
            return 0;




            // case #5
        else if (distance == 0 && (Math.abs(r1 - r2) > 0))
            return 0;


            // case #4, 접점 X
        else    //  r1 + r2 < d
            return 0;



    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int round = Integer.parseInt(br.readLine());

        for (int i = 0; i < round; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            long x1 = Long.parseLong(st.nextToken());
            long y1 = Long.parseLong(st.nextToken());
            long r1 = Long.parseLong(st.nextToken());

            long x2 = Long.parseLong(st.nextToken());
            long y2 = Long.parseLong(st.nextToken());
            long r2 = Long.parseLong(st.nextToken());


            sb.append(check_crossed_range_points(x1, y1, r1, x2, y2, r2) + "\n");

        }


        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
