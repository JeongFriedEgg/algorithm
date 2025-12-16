package algorithm.구현;

import java.io.*;

public class S5_1316 {
    public static boolean isGroupWord(String word) {
        boolean[] used = new boolean[26];

        char prev = 0;

        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);

            if (current != prev) {
                if (used[current - 'a']) {
                    return false;
                }
                used[current - 'a'] = true;
            }
            prev = current;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int groupWordCount = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (isGroupWord(word)) {
                groupWordCount++;
            }
        }

        System.out.println(groupWordCount);
    }
}
