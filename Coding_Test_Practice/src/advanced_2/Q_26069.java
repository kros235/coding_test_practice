package advanced_2;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q_26069 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        HashMap<String, Integer> list = new HashMap<>();
        int round = Integer.parseInt(br.readLine());
        int dancer = 0;

        for (int i = 0; i < round; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String host = st.nextToken();
            String guest = st.nextToken();

            if (host.equals("ChongChong") == true || guest.equals("ChongChong") == true) {

                // add non-ChongChong dancer to the list
                if (host.equals("ChongChong") == true) {
                    if (list.containsKey(guest) == false) {
                        list.put(guest, 1);
                        dancer++;
                    }
                } else {
                    if (list.containsKey(host) == false) {
                        list.put(host, 1);
                        dancer++;
                    }
                }

                // add ChongChong, the original dancer and increase dancer counter
                if (list.containsKey("ChongChong") == false) {
                    dancer++;

                    // add ChongChong, the original dancer to the list
                    list.put("ChongChong", 1);
                }
            } else if (list.containsKey(host) == true || list.containsKey(guest) == true) {

                if (list.containsKey(guest) == false) {
                    list.put(guest, 1);
                    dancer++;
                }

                if (list.containsKey(host) == false) {
                    list.put(host, 1);
                    dancer++;
                }
            }
        }

        sb.append(dancer);
        bw.write(sb + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

}
