package algorithm.구현;

import java.io.*;

public class S5_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int N = 1;
        int count = 0;

        while (count + N < X) {
            count += N;
            N++;
        }

        int order = X - count;

        int numerator;
        int denominator;

        if (N % 2 == 1) {
            numerator = N - order + 1;
            denominator = order;
        } else {
            numerator = order;
            denominator = N - order + 1;
        }

        System.out.println(numerator + "/" + denominator);
    }
}
