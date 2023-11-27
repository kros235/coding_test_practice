package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q_1966 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int round       =   Integer.parseInt( br.readLine() );

        for ( int m = 0 ; m < round ; m++ ) {
            //  doc_count, target selection
            StringTokenizer st = new StringTokenizer(br.readLine());
            int doc_count = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());
            String target_name = "";

            //  create doc names
            Main.document[] docs = new Main.document[doc_count];
            for (int i = 0; i < doc_count; i++) {
                String name = String.valueOf((char) (65 + i));
                docs[i] = new Main.document(name, 0);
                if (i == target)
                    target_name = name;
            }

            //  set doc priorities
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < doc_count; i++) {
                int priority = Integer.parseInt(st.nextToken());
                docs[i].set_priority(priority);
            }

            // put docs in deque
            Deque<Main.document> deque = new ArrayDeque<>();
            for (int i = 0; i < doc_count; i++)
                deque.add(docs[i]);

            // main printing process
            int print_count = 0;
            while (true) {

                int max_priority = get_max_priority(deque, deque.size()) ;

                Main.document doc = deque.pollFirst();
                String doc_name = doc.get_name();
                int doc_priority = doc.get_priority();

                if (max_priority == doc_priority) {
                    if (doc_name.equals(target_name)) {
                        print_count++;
                        sb.append(print_count + "\n");
                        break;
                    } else {
                        print_count++;
                        continue;
                    }
                }
                deque.add(doc);
            }
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    public static int get_max_priority(Deque<Main.document> deque, int doc_count ){
        int max_priority    =   -1;

        //while ( !deque.isEmpty() ){
        for ( int i = 0 ; i < doc_count ; i++ ){
            Main.document doc    =   deque.pollFirst();
            int current_priority    =   doc.get_priority();
            if ( current_priority > max_priority )
                max_priority =   current_priority;
            deque.add( doc );
        }
        return max_priority;
    }

    public static class document{
        String doc_name;
        int priority;
        public document(String doc_name, int priority){
            this.doc_name   =   doc_name;
            this.priority   =   priority;
        }

        public String get_name(){
            return doc_name;
        }

        public int get_priority(){
            return priority;
        }

        public void set_priority(int priority){
            this.priority = priority;
        }
    }

}
