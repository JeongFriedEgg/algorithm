package algorithm.구현;

import java.io.*;

public class S2_2607 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String target = br.readLine();
        int targetLen = target.length();
        int[] targetCounts = new int[26];

        for (char c : target.toCharArray()) {
            targetCounts[c - '0' - 17]++;
        }

        int result = 0;
        for (int i = 0; i < N - 1; i++) {
            String compare = br.readLine();
            int compareLen = compare.length();
            int[] compareCounts = targetCounts.clone();
            int sameCharCount = 0;

            for (char c : compare.toCharArray()) {
                if (compareCounts[c - '0' - 17] > 0) {
                    sameCharCount++;
                    compareCounts[c - '0' - 17]--;
                }
            }

            if (targetLen == compareLen) {
                if (targetLen == sameCharCount || targetLen - 1 == sameCharCount) {
                    result++;
                }
            } else if (targetLen == compareLen + 1) {
                if (compareLen == sameCharCount) {
                    result++;
                }
            } else if (targetLen + 1 == compareLen) {
                if (targetLen == sameCharCount) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}