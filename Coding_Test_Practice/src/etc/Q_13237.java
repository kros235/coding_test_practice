package etc;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q_13237 {

    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int nodes = Integer.parseInt(br.readLine());
        int root_index = -1;

        // create visit_checker
        boolean[] visit_checker = new boolean[nodes];
        int[] level = new int[nodes];
        Arrays.fill(visit_checker, false);
        Arrays.fill(level, -999);

        // create adjacent graph linked list map
        ArrayList<ArrayList<Integer>> link = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < nodes; i++)
            link.add(new ArrayList<>());

        // record connected linked nodes
        for (int i = 0; i < nodes; i++) {
            int linked_parent = Integer.parseInt(br.readLine());
            if (linked_parent == -1)
                root_index = i;
            else
                link.get(linked_parent - 1).add(i);
        }

        int level_counter   =   0;
        // create DFS Stack to visit nodes and put root node at the beginning
        Stack<Integer> DFS_stack = new Stack<>();
        DFS_stack.push(root_index);
        level[root_index]   =   level_counter ++;


        while (!DFS_stack.isEmpty()) {

            int current_node = DFS_stack.peek();


            if ( visit_checker[current_node] == false) {

                visit_checker[current_node] = true;

                if (link.get(current_node).size() > 0 ) {
                    for (int i = 0; i < link.get(current_node).size(); i++) {
                        DFS_stack.push(link.get(current_node).get(i));
                        level[link.get(current_node).get(i)]   =   level_counter ;
                    }
                    level_counter++;
                }
                else {
                    //sb.append((DFS_stack.pop() ) + " - ");
                    DFS_stack.pop();
                    if ( DFS_stack.size() > 0 )
                        level_counter   =   level[ DFS_stack.peek() ] + 1;
                }
            }
            else {
                //sb.append((DFS_stack.pop() ) + " - ");
                DFS_stack.pop();
                if ( DFS_stack.size() > 0 )
                    level_counter   =   level[ DFS_stack.peek() ] + 1;
            }
        }


        for ( int i = 0 ; i < level.length ; i++ )
            sb.append ( level[i] + "\n");
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }

}
