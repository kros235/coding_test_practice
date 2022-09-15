import java.io.*;
import java.util.ArrayList;

public class Main {

    static ArrayList<Long> boundaries = new ArrayList<>();

    public static ArrayList<Long> generate_boundaries(long a) {

        boundaries.add(0, 1L);
        //System.out.println(0 + " : " +  1);

        for (int i = 1; ; i++) {
            //System.out.println("\t\ta = " + a + "\tboundaries.get(i-1) = " + boundaries.get(i-1));
            if (a > boundaries.get(i-1)) {
                boundaries.add(i, (boundaries.get(i - 1) + (i+1)));
                //System.out.println(i + " : " +  (boundaries.get(i - 1) + i));
            }
            else
                break;
        }
        return boundaries;
    }

    public static long find_area(long a) {

        long result = 0;
        ArrayList<Long> boundaries = new ArrayList<>();
        boundaries = generate_boundaries(a);

        for (int i = 0; i < boundaries.size(); i++) {
            //System.out.println("a = " + a + "\tboundaries.get(i) = " + boundaries.get(i));
            if (a <= boundaries.get(i)) {
                //System.out.println("returned " + i);
                return i;
            }
        }

        return 0;
    }

    public static String find_fraction(long a) {

        long area_index = find_area( a );

        //System.out.println("area_index = " + area_index);


        long remainder;

        if (area_index - 1 < 0 )
            remainder= a - boundaries.get((int) area_index);
        else
            remainder= a - boundaries.get((int) area_index - 1);

        //System.out.println("remainder = " + remainder);
        //System.out.println("boundaries.get((int) area_index) = " + boundaries.get((int) area_index));

        // area_index % 2 == 0 :  우하향 방향으로 진행
        // area_index % 2 == 1 :  좌상향 방향으로 진행


        if ( area_index  == 0 )
            return 1 + "/" + 1;
        else if ( area_index % 2 == 0 )
            return ( 1 + (remainder-1) ) + "/" + ( (area_index+1) - (remainder-1) );
        else
            return ( (area_index+1) - (remainder-1) ) + "/" + ( 1 + (remainder-1) );

    }


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String digit = br.readLine();
        if (Long.parseLong(digit) < 1 || Long.parseLong(digit) > 1000000000) {
        } else {
            String result = find_fraction( Long.parseLong(digit) );
            bw.write( result );
        }
        bw.flush();
        br.close();
        bw.close();

    }
}