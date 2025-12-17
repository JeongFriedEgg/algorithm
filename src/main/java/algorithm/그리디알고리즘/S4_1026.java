package algorithm.그리디알고리즘;

import java.io.*;
import java.util.*;

public class S4_1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        int[] B = new int[N];

        StringTokenizer stA = new StringTokenizer(br.readLine());
        StringTokenizer stB = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(stA.nextToken());
            B[i] = Integer.parseInt(stB.nextToken());
        }

        Arrays.sort(A);
        Arrays.sort(B);

        int S = 0;
        for (int i = 0; i < N; i++) {
            S += A[i] * B[N - 1 - i];
        }

        System.out.println(S);
    }
}
