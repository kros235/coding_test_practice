import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException {

        Scanner input = new Scanner(System.in);

        int input_year  =   input.nextInt();
        int output      =   (input_year - 1946);
        System.out.println(output);

    }
}

