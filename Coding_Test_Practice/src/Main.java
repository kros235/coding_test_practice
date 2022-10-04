import java.io.*;
import java.util.*;

public class Main {


    ArrayList<Integer> digits = new ArrayList<>();
    static boolean duplicated_max = false;


    public static int get_arithematic_average(Object[] inputs) {

        int sum = 0;
        for (int i = 0; i < inputs.length; i++)
            sum += (int) inputs[i];

        return sum / inputs.length;

    }


    public static int get_the_most_frequent_values(Object[] inputs) {

        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        int count = 1;
        for (int i = 0; i < inputs.length; i++) {

            for (int j = i + 1; j < inputs.length; j++) {

                if ((int) inputs[i] == (int) inputs[j])
                    hashmap.put((int) inputs[i], count++);
                else
                    count = 2;

            }

        }


        if (hashmap.size() == 0)
            return (int) inputs[1];

            // 다수의 중복 값이 있을 경우 ( 최고 값 반환 ) 또는 동일한 빈도수로 나온 경우
        else
            return get_max_value(hashmap);

    }

    public static int get_max_value(HashMap<Integer, Integer> hashmap) {

        int max = -999;
        int single_max_value = 1;
        Set<Integer> keySet = hashmap.keySet();
        for (Integer key : keySet) {

            if (max < hashmap.get(key))
                max = hashmap.get(key);
            if (max == hashmap.get(key))
                duplicated_max = true;
            System.out.println(key + " : " + hashmap.get(key));
        }

        System.out.println("max =  " + max);

        if (duplicated_max == false) {

            for (Integer key : hashmap.keySet()) {

                Integer value = hashmap.get(key);
                if (value == max)
                    single_max_value = key;

            }
            return single_max_value;
        }

        //  동일한 빈도수로 나온 경우
        else {

            int[] inputs = new int[hashmap.size()];
            int count = 0;

            for (Integer key : hashmap.keySet()) {

                Integer value = hashmap.get(key);
                if (value == max) {
                    if (inputs.length > 1) {
                        if (inputs[count - 1] != key)
                            inputs[count++] = key;
                        else continue;
                    } else
                        inputs[count++] = key;

                }

                Arrays.sort(inputs);

                return inputs[1];
            }
        }
    }


    public static int get_median (Object[]inputs){

        return (int) inputs[inputs.length / 2];

    }

    public static int get_range (Object[]inputs){

        return ((int) inputs[inputs.length - 1] - (int) inputs[0]);

    }


    public static void main (String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int round = Integer.parseInt(br.readLine());
        ArrayList<Integer> digits = new ArrayList<>();


        if (round < 1 || round > 500000 || round % 2 == 0) {
        } else {


            for (int i = 0; i < round; i++) {
                int temp = Integer.parseInt(br.readLine());
                if (Math.abs(temp) <= 4000)
                    digits.add(temp);
            }

            Object[] inputs = digits.toArray();
            Arrays.sort(inputs);


            bw.write(String.valueOf(String.valueOf(get_arithematic_average(inputs))) + "\n");

            bw.write(String.valueOf(String.valueOf(get_median(inputs))) + "\n");

            bw.write(String.valueOf(String.valueOf(get_the_most_frequent_values(inputs))) + "\n");

            bw.write(String.valueOf(String.valueOf(get_range(inputs))) + "\n");

        }
        bw.flush();
        br.close();
        bw.close();
    }
}