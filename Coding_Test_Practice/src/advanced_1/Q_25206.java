package advanced_1;

import java.io.*;
import java.util.StringTokenizer;

public class Q_25206 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        double grade_sum = 0.0, credit_sum = 0.0;

        for ( int i = 0 ; i < 20 ; i++ ){

            StringTokenizer st  =   new StringTokenizer( br.readLine() );
            String course       =   st.nextToken();
            double credit       =   Double.parseDouble( st.nextToken() );
            String grade        =   st.nextToken();



            switch ( grade ) {
                case "A+": {
                    grade_sum += credit * 4.5;
                    credit_sum += credit;
                    break;
                }
                case "A0": {
                    grade_sum += credit * 4.0;
                    credit_sum += credit;
                    break;
                }
                case "B+": {
                    grade_sum += credit * 3.5;
                    credit_sum += credit;
                    break;
                }
                case "B0": {
                    grade_sum += credit * 3.0;
                    credit_sum += credit;
                    break;
                }
                case "C+": {
                    grade_sum += credit * 2.5;
                    credit_sum += credit;
                    break;
                }
                case "C0": {
                    grade_sum += credit * 2.0;
                    credit_sum += credit;
                    break;
                }
                case "D+": {
                    grade_sum += credit * 1.5;
                    credit_sum += credit;
                    break;
                }
                case "D0": {
                    grade_sum += credit * 1.0;
                    credit_sum += credit;
                    break;
                }
                case "F": {
                    grade_sum += credit * 0;
                    credit_sum += credit;
                    break;
                }
                default:{ //"P"
                    break;
                }
            }

        }

        sb.append( ( grade_sum / credit_sum) + "\n");
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
