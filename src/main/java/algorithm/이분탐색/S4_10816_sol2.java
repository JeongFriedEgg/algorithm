package algorithm.이분탐색;

import java.io.*;
import java.util.*;

public class S4_10816_sol2 {
    static int[] N_arr;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        N_arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < N; i++) {
            N_arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(N_arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");

        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());

            int count = upperBound(target) - lowerBound(target);
            sb.append(count).append(" ");
        }

        System.out.println(sb);
    }

    public static int lowerBound(int target) {
        int low = 0;
        int high = N;

        while (low < high) {
            int mid =  low + (high - low) / 2;

            if (target <= N_arr[mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int upperBound(int target) {
        int low = 0;
        int high = N;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (target < N_arr[mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
