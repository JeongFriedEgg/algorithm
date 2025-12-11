package algorithm.조합론;

import java.io.*;
import java.util.StringTokenizer;

public class S5_16395 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long[][] dp = new long[31][31];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }
        }

        System.out.println(dp[N][K]);
    }
}
