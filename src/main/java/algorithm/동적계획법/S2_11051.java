package algorithm.동적계획법;

import java.io.*;
import java.util.*;

public class S2_11051 {
    final static int MOD = 10007;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        dp = new int[N + 1][K + 1];

        System.out.println(combinations(N,K));
    }

    static int combinations(int n, int k) {
        if (k == 0 || n == k) {
            return 1;
        }
        if (k < 0 || k > n) {
            return 0;
        }
        if (dp[n][k] > 0) {
            return dp[n][k];
        }

        dp[n][k] = (combinations(n-1,k-1) + combinations(n-1,k)) % MOD;

        return dp[n][k];
    }
}
