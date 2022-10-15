import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static int test( int a, int b){
        return a > b  ? a : b;
    }

    public static void main(String args[]) throws IOException {


        int a = 3;
        int b = 2;
        int result = test ( a,  b);

        System.out.println(result);



    }
}
