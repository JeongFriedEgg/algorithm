package algorithm.큐;

import java.io.*;
import java.util.*;

public class S4_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    int X = Integer.parseInt(st.nextToken());
                    queue.offer(X);
                    break;

                case "pop":
                    if (queue.isEmpty()) {
                        sb.append("-1").append('\n');
                    } else {
                        sb.append(queue.poll()).append('\n');
                    }
                    break;

                case "size":
                    sb.append(queue.size()).append('\n');
                    break;

                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append('\n');
                    break;

                case "front":
                    if (queue.isEmpty()) {
                        sb.append("-1").append('\n');
                    } else {
                        sb.append(queue.peek()).append('\n');
                    }
                    break;

                case "back":
                    if (queue.isEmpty()) {
                        sb.append("-1").append('\n');
                    } else {
                        sb.append(queue.peekLast()).append('\n');
                    }
                    break;
            }
        }

        System.out.print(sb);
    }
}
