package etc;

import java.io.*;
import java.math.BigInteger;

public class Q_4999 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String patient  =   br.readLine();
        String doctor   =   br.readLine();

        int patient_count   =   0;
        int doctor_count    =   0;

        for (int i = 0 ; i < patient.length() ; i++ )
            if ( patient.charAt(i) != 'h')
                patient_count++;

        for (int i = 0 ; i < doctor.length() ; i++ )
            if ( doctor.charAt(i) != 'h')
                doctor_count++;

        if (patient_count >= doctor_count)
            bw.write("go");
        else
            bw.write("no");

        bw.flush();
        br.close();
        bw.close();

    }

}
