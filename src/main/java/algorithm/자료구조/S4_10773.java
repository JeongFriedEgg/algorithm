package algorithm.자료구조;

import java.io.*;
import java.util.*;

public class S4_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < K; i++) {
            int number = Integer.parseInt(br.readLine());

            if (number == 0) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(number);
            }
        }

        long sum = 0;
        for (int number : stack) {
            sum += number;
        }

        System.out.println(sum);
    }
}
