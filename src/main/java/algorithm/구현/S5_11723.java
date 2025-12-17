package algorithm.구현;

import java.io.*;
import java.util.StringTokenizer;

public class S5_11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());
        int bitset = 0;

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String op = st.nextToken();
            int x;

            switch (op) {
                case "add":
                    x = Integer.parseInt(st.nextToken());
                    bitset |= (1 << (x - 1));
                    break;
                case "remove":
                    x = Integer.parseInt(st.nextToken());
                    bitset &= ~(1 << (x - 1));
                    break;
                case "check":
                    x = Integer.parseInt(st.nextToken());
                    sb.append((bitset & (1 << (x - 1))) != 0 ? "1\n" : "0\n");
                    break;
                case "toggle":
                    x = Integer.parseInt(st.nextToken());
                    bitset ^= (1 << (x - 1));
                    break;
                case "all":
                    bitset = (1 << 20) - 1;
                    break;
                case "empty":
                    bitset = 0;
                    break;
            }
        }
        System.out.print(sb);
    }
}
