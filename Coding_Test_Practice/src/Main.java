import java.io.*;
import java.util.ArrayList;

public class Main {

    static int count = 0;


    public static void move_plate(ArrayList<Integer> first_poll, ArrayList<Integer> second_poll, ArrayList<Integer> third_poll){

        // finished
        if ( first_poll.size() == 0 && second_poll.size() == 0) return;


        else if ( first_poll.size()!= 0 ){

            // first_poll -> third_poll
            if ( third_poll.size() == 0
                    || third_poll.get(third_poll.size()-1) > first_poll.get(first_poll.size()-1) ){
                third_poll.add( 0, first_poll.get( first_poll.size()-1 ));
                first_poll.remove( first_poll.size()-1 );
                count ++;
                move_plate( first_poll, second_poll, third_poll );
            }


            // first_poll -> second_poll
            else
                /*if ( third_poll.get(third_poll.size()-1) < first_poll.get(first_poll.size()-1)
                    && ( second_poll.size() == 0 || second_poll.get(second_poll.size()-1) > first_poll.get(first_poll.size()-1) ) )*/
            {
                second_poll.add( 0, first_poll.get( first_poll.size()-1 ));
                first_poll.remove( first_poll.size()-1 );
                move_plate( first_poll, second_poll, third_poll );
            }
        }

        else if ( second_poll.size()!= 0 ){

            // second_poll -> third_poll
            if (second_poll.get(second_poll.size() - 1) < third_poll.get(third_poll.size() - 1)) {
                third_poll.add(0, second_poll.get(second_poll.size() - 1));
                second_poll.remove(second_poll.size() - 1);
                move_plate(first_poll, second_poll, third_poll);
            }

            // second_poll -> first_poll
            else
                /*if (second_poll.get(second_poll.size() - 1) < first_poll.get(first_poll.size() - 1))*/
            {
                first_poll.add(0, second_poll.get(second_poll.size() - 1));
                second_poll.remove(second_poll.size() - 1);
                move_plate(first_poll, second_poll, third_poll);
            }


        }


        else{

            // third_poll -> second_poll
            if (third_poll.get(second_poll.size() - 1) < second_poll.get(third_poll.size() - 1))
            {
                second_poll.add(0, third_poll.get(third_poll.size() - 1));
                third_poll.remove(third_poll.size() - 1);
                move_plate(first_poll, second_poll, third_poll);
            }

            // third_poll -> first_poll
            else {
                first_poll.add(0, third_poll.get(third_poll.size() - 1));
                third_poll.remove(third_poll.size() - 1);
                move_plate(first_poll, second_poll, third_poll);
            }
        }

    }
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int plate = Integer.parseInt( br.readLine() );

        ArrayList<Integer> first_poll   =   new ArrayList<>();
        ArrayList<Integer> second_poll  =   new ArrayList<>();
        ArrayList<Integer> third_poll   =   new ArrayList<>();

        // fill_poll with plates
        for ( int i = plate ; i > 0 ; i-- )
            first_poll.add( i );

        move_plate( first_poll, second_poll, third_poll );

        bw.write( String.valueOf(count) );

        bw.flush();
        br.close();
        bw.close();
    }


}

