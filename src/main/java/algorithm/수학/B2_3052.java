package algorithm.수학;

import java.io.*;

public class B2_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[42];

        for (int i = 0; i < 10; i++) {
            arr[Integer.parseInt(br.readLine()) % 42] = true;
        }

        int count = 0;
        for (boolean value : arr) {
            if (value) {
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }
}
