package basic_mathematics_1;

import java.io.*;
import java.util.ArrayList;

public class Q_2839 {
    public static int calculate_sacks(int sugar_amount) {

        int result = -1;

        int quotient    =   sugar_amount / 5;
        int remainder   =   sugar_amount % 5;

        // 5 kg 미만
        if( quotient == 0 ){
            remainder   =   sugar_amount % 3;
            // 5 kg 미만, 3kg로 안 나눠지는 수 (예 : 4kg)
            if( remainder!= 0 )
                return -1;
            else
                return (sugar_amount / 3);
        }

        // 5 kg 이상
        else {
            // 5kg + 3kg 혼합 유형 탐색
            for (int i = quotient; i > 0; i--){
                int remain_amount = sugar_amount - (5 * i);
                if( remain_amount % 3 == 0){
                    result = i + (remain_amount / 3);
                    return result;
                }
            }

            // 3kg 단독 유형 탐색
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
