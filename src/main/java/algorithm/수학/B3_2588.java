package algorithm.수학;

import java.io.*;

public class B3_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        bw.write(num1 * (num2 % 10) + "\n");
        bw.write(num1 * (num2 % 100 / 10) + "\n");
        bw.write(num1 * (num2 / 100) + "\n");
        bw.write(num1 * num2 + "\n");

         bw.flush();
         br.close();
         bw.close();
    }
}
