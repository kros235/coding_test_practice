package etc;

import java.io.*;

public class Q_2839 {
    public static int calculate_sacks(int sugar_amount) {

        int result = -1;

        int quotient    =   sugar_amount / 5;
        int remainder   =   sugar_amount % 5;

        // 5 kg �̸�
        if( quotient == 0 ){
            remainder   =   sugar_amount % 3;
            // 5 kg �̸�, 3kg�� �� �������� �� (�� : 4kg)
            if( remainder!= 0 )
                return -1;
            else
                return (sugar_amount / 3);
        }

        // 5 kg �̻�
        else {
            // 5kg + 3kg ȥ�� ���� Ž��
            for (int i = quotient; i > 0; i--){
                int remain_amount = sugar_amount - (5 * i);
                if( remain_amount % 3 == 0){
                    result = i + (remain_amount / 3);
                    return result;
                }
            }

            // 3kg �ܵ� ���� Ž��
            if (result == -1 &&  sugar_amount % 3 == 0){
                return (sugar_amount / 3);
            }
        }
        return result;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String sugar_amount = br.readLine();
        int sugar_kg_amount = Integer.parseInt( sugar_amount );

        if( sugar_kg_amount < 3 || sugar_kg_amount > 5000){}
        else {
            int result = calculate_sacks ( sugar_kg_amount );
            bw.write(result + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
