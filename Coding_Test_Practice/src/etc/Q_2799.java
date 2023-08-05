package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Q_2799 {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int floor = Integer.parseInt(st.nextToken());
        int room = Integer.parseInt(st.nextToken());

        int[][] classifier = new int[floor][room];


        for (int k = 0; k < floor; k++) {
            String input = br.readLine();

            for (int i = 0; i < 4; i++) {
                input = br.readLine();
                st = new StringTokenizer(input.substring(1, input.length() - 1), "#");
                for (int j = 0; j < room; j++) {
                    String temp = st.nextToken();
                    if (temp.equals("****"))

                        classifier[k][j]++;
                }
            }
        }


        int[] blind_type = counting_type(classifier);

        for (int i = 0; i < blind_type.length; i++)
            sb.append(blind_type[i] + " ");
        sb.append("\n");

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

    private static int[] counting_type(int[][] classifier) {
        int[] blind_type = new int[5];


        for (int i = 0; i < classifier.length; i++) {
            for (int j = 0; j < classifier[i].length; j++) {
                switch (classifier[i][j]) {
                    case 4: {
                        blind_type[4]++;
                        break;
                    }
                    case 3: {
                        blind_type[3]++;
                        break;
                    }
                    case 2: {
                        blind_type[2]++;
                        break;
                    }
                    case 1: {
                        blind_type[1]++;
                        break;
                    }
                    default: {
                        blind_type[0]++;
                        break;
                    }
                }
            }
        }

        return blind_type;
    }
}
