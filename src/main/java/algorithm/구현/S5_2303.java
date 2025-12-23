package algorithm.구현;

import java.io.*;
import java.util.*;

public class S5_2303 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int winner = 0;
        int maxScore = -1;

        for (int p = 1; p <= N; p++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] cards = new int[5];
            for (int i = 0; i < 5; i++) {
                cards[i] = Integer.parseInt(st.nextToken());
            }

            int currentMax = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = i + 1; j < 4; j++) {
                    for (int k = j + 1; k < 5; k++) {
                        int score = (cards[i] + cards[j] + cards[k]) % 10;
                        if (score > currentMax) {
                            currentMax = score;
                        }
                    }
                }
            }

            if (currentMax >= maxScore) {
                maxScore = currentMax;
                winner = p;
            }
        }

        System.out.println(winner);
    }
}