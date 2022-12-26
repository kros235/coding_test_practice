package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.HashMap;

public class Q_1076 {

    static HashMap<String, String> resistance_1 = new HashMap<>();
    static HashMap<String, String> resistance_2 = new HashMap<>();

    public static String get_value_1(String first_resistance, String second_resistance) {

        String result = "";
        result += resistance_1.get(first_resistance);
        result += resistance_1.get(second_resistance);
        return result;

    }

    public static String get_value_2(String third_resistance) {

        String result = "";
        result += resistance_2.get( resistance_1.get (third_resistance) );
        return result;

    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        resistance_1.put("black", "0");
        resistance_1.put("brown", "1");
        resistance_1.put("red", "2");
        resistance_1.put("orange", "3");
        resistance_1.put("yellow", "4");
        resistance_1.put("green", "5");
        resistance_1.put("blue", "6");
        resistance_1.put("violet", "7");
        resistance_1.put("grey", "8");
        resistance_1.put("white", "9");

        resistance_2.put("0", "1");
        resistance_2.put("1", "10");
        resistance_2.put("2", "100");
        resistance_2.put("3", "1000");
        resistance_2.put("4", "10000");
        resistance_2.put("5", "100000");
        resistance_2.put("6", "1000000");
        resistance_2.put("7", "10000000");
        resistance_2.put("8", "100000000");
        resistance_2.put("9", "1000000000");


        String first_resistance = br.readLine();
        String second_resistance = br.readLine();
        String third_resistance = br.readLine();


        String resistance_value_1 = get_value_1(first_resistance, second_resistance);
        String resistance_value_2 = get_value_2(third_resistance);

        BigInteger result_temp_1 = new BigInteger(resistance_value_1);
        BigInteger result_temp_2 = new BigInteger(resistance_value_2);

        BigInteger result = result_temp_1.multiply(result_temp_2);

        sb.append(result + "\n");

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
