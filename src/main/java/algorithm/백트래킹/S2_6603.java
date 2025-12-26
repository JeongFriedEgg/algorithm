package algorithm.백트래킹;

import java.io.*;
import java.util.*;

public class S2_6603 {
    static int K;
    static int[] S;
    static int[] result = new int[6];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            K = Integer.parseInt(st.nextToken());
            if (K == 0) break;

            S = new int[K];
            for (int i = 0; i < K; i++) {
                S[i] = Integer.parseInt(st.nextToken());
            }

            dfs(0, 0);
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }

    private static void dfs(int start, int depth) {
        if (depth == 6) {
            for (int val : result) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < K; i++) {
            result[depth] = S[i];
            dfs(i + 1, depth + 1);
        }
    }
}