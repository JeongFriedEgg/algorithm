package algorithm.정렬;

import java.io.*;

public class S5_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] counts = new int[10];

        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - '0']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            while (counts[i] > 0) {
                sb.append(i);
                counts[i]--;
            }
        }

        System.out.println(sb);
    }
}
