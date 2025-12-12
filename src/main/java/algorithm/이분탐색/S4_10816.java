package algorithm.이분탐색;

import java.io.*;
import java.util.*;

public class S4_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        HashMap<Integer, Integer> cardCounts = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int card = Integer.parseInt(st.nextToken());
            cardCounts.put(card, cardCounts.getOrDefault(card,0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");

        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());

            sb.append(cardCounts.getOrDefault(target, 0)).append(" ");
        }
        System.out.println(sb);
    }
}
