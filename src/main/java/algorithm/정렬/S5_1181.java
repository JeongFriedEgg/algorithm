package algorithm.정렬;

import java.io.*;
import java.util.*;

public class S5_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] words = new String[N];
        for (int i = 0; i < N; i++) {
            words[i] = br.readLine();
        }

        Arrays.sort(words, (s1, s2) -> {
            if (s1.length() == s2.length()) {
                return s1.compareTo(s2);
            }
            return s1.length() - s2.length();
        });

        StringBuilder sb = new StringBuilder();
        if (N > 0) {
            sb.append(words[0]).append('\n');
            for (int i = 1; i < N; i++) {
                if (!words[i].equals(words[i - 1])) {
                    sb.append(words[i]).append('\n');
                }
            }
        }
        System.out.print(sb);
    }
}
