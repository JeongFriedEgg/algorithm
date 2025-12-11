package algorithm.조합론;

import java.io.*;
import java.util.StringTokenizer;

public class S5_1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            sb.append(combination(M, N)).append('\n');
        }

        System.out.print(sb);
    }

    public static long combination(int M, int N) {
        if (N > M / 2) {
            N = M - N;
        }

        long result = 1;

        for (int i = 1; i <= N; i++) {
            result = result * (M - i + 1) / i;
        }

        return result;
    }
}
