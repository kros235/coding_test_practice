package one_dimensional_array;
import java.util.Scanner;

public class Q_2562 {
    public static void main(String args[]) {


        int max = -1, max_index = 0;
        int[] num = new int[9];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {

            num[i] = input.nextInt();
            if (num[i] > 100) {
            } else {
                if(num[i] > max){
                    max_index = i;
                    max = num[i];
                }
            }

        }
        System.out.println(max + "\n" + (max_index+1) );
    }
}
