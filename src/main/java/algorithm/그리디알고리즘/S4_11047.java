package algorithm.그리디알고리즘;

import java.io.*;
import java.util.*;

public class S4_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        int totalCount = 0;

        for (int i = N - 1; i >= 0; i--) {
            int coinValue = coins[i];

            if (K == 0) {
                break;
            }

            if (K >= coinValue) {
                int count = K / coinValue;
                totalCount += count;
                K %= coinValue;
            }
        }
        System.out.println(totalCount);
    }
}
