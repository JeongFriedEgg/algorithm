package algorithm.구현;

import java.io.*;

public class B2_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int value = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        int[] counts = new int[10];

        String str = String.valueOf(value);

        for (int i = 0; i < str.length(); i++) {
            counts[(str.charAt(i) - 48)]++;
        }

        for (int v : counts) {
            System.out.println(v);
        }
    }
}
