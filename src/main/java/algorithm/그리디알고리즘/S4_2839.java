package algorithm.그리디알고리즘;

import java.io.*;

public class S4_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int five_count = N / 5;
        int three_count = 0;

        while (five_count >= 0) {
            int remaining_weight = N - (five_count * 5);

            if (remaining_weight % 3 == 0) {
                three_count = remaining_weight / 3;

                System.out.println(five_count + three_count);
                return;
            }

            five_count--;
        }

        System.out.println(-1);
    }
}
