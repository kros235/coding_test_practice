package etc;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q_10825_re {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int round = Integer.parseInt(st.nextToken());

        //ArrayList<Student> list =    new ArrayList<>();
        Student[] list = new Student[round];

        for (int i = 0; i < round; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int korean = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            list[i] = new Student(name, korean, english, math);
        }

        Comparator<Student> myComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.korean < o2.korean) {
                    return 1;
                } else if (o1.korean == o2.korean) {
                    if (o1.english > o2.english) {
                        return 1;
                    } else if (o1.english == o2.english) {
                        if (o1.math < o2.math) {
                            return 1;
                        } else if (o1.math == o2.math) {
                            return o1.name.compareTo(o2.name);
                        }
                    }
                }
                return -1;
            }
        };

        Arrays.sort(list, myComparator);

        for (int i = 0; i < list.length; i++) {
            sb.append(list[i].name + "\n");
        }


        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }


    public static class Student {
        String name;
        int korean;
        int english;
        int math;


        public Student(String name, int korean, int english, int math) {
            super();
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }
    }
}
