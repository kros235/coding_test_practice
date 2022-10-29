import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String grade   =    br.readLine();
        double result;

        switch (grade){
            case "A+":{
                result = 4.3;
                break;
            }
            case "A0":{
                result = 4.0;
                break;
            }
            case "A-":{
                result = 3.7;
                break;
            }
            case "B+":{
                result = 3.3;
                break;
            }
            case "B0":{
                result = 3.0;
                break;
            }
            case "B-":{
                result = 2.7;
                break;
            }
            case "C+":{
                result = 2.3;
                break;
            }
            case "C0":{
                result = 2.0;
                break;
            }
            case "C-":{
                result = 1.7;
                break;
            }
            case "D+":{
                result = 1.3;
                break;
            }
            case "D0":{
                result = 1.0;
                break;
            }
            case "D-":{
                result = 0.7;
                break;
            }
            default:{
                result = 0;
                break;
            }
        }

        bw.write( String.valueOf( result ) );

        bw.flush();
        br.close();
        bw.close();
    }
}

