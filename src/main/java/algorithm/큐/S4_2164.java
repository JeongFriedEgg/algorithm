package algorithm.큐;

import java.io.*;
import java.util.*;

public class S4_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        while (deque.size() > 1) {
            deque.removeFirst();
            deque.add(deque.removeFirst());
        }

        System.out.println(deque.peek());
    }
}