package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q_1380 {



    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int scenario_no = 0;

        while (true) {
            int student_number = Integer.parseInt(br.readLine());
            String[] student_name = new String[student_number];

            if (student_number == 0)
                break;

            else {
                scenario_no++;
                // save names
                for (int i = 0; i < student_number; i++)
                    student_name[i] = br.readLine();


                // record earring confiscation
                Map<Integer, String> map = new HashMap<>();
                for (int i = 0; i < 2 * student_number - 1; i++) {

                    StringTokenizer st = new StringTokenizer(br.readLine());
                    int student_no = Integer.parseInt(st.nextToken());
                    String student_alphabet = st.nextToken();

                    if (map.containsKey(student_no) != true)
                        map.put(student_no, student_alphabet);
                    else
                        map.remove(student_no);

                }

                if (map.size() != 0) {
                    for (Map.Entry<Integer, String> entrySet : map.entrySet())
                        sb.append(scenario_no + " " + student_name[entrySet.getKey() - 1] + "\n");
                }
            }
        }
        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();
    }

}
