package algorithm.조합론;

import java.io.*;
import java.util.StringTokenizer;

public class B1_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        if (K < 0 || K > N) {
            System.out.println(0);
            return;
        }

        int numerator = factorial(N);
        int denominator = factorial(K) * factorial(N - K);

        System.out.println(numerator / denominator);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
