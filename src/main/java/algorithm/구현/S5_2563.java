package algorithm.구현;

import java.io.*;
import java.util.StringTokenizer;

public class S5_2563 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[][] paper = new boolean[100][100];

        int n = Integer.parseInt(br.readLine());
        int totalArea = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int r = x; r < x + 10; r++) {
                for (int c = y; c < y + 10; c++) {
                    if (!paper[r][c]) {
                        paper[r][c] = true;
                        totalArea++;
                    }
                }
            }
        }

        System.out.println(totalArea);
    }
}
