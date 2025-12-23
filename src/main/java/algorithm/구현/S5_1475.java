package algorithm.구현;

import java.io.*;

public class S5_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int[] counts = new int[10];

        for (char c : n.toCharArray()) {
            counts[c - '0']++;
        }

        int sixNineSum = counts[6] + counts[9];
        counts[6] = (sixNineSum + 1) / 2;
        counts[9] = 0;

        int maxSets = 0;
        for (int i = 0; i < 9; i++) {
            maxSets = Math.max(maxSets, counts[i]);
        }

        System.out.println(maxSets);
    }
}
