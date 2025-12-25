package algorithm.구현;

import java.io.*;
import java.util.*;

public class S4_1388 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] floor = new char[N][M];
        boolean[][] visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            floor[i] = br.readLine().toCharArray();
        }

        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (visited[i][j]) continue;

                count++;
                char current = floor[i][j];
                visited[i][j] = true;

                if (current == '-') {
                    int nextJ = j + 1;
                    while (nextJ < M && floor[i][nextJ] == '-') {
                        visited[i][nextJ] = true;
                        nextJ++;
                    }
                } else {
                    int nextI = i + 1;
                    while (nextI < N && floor[nextI][j] == '|') {
                        visited[nextI][j] = true;
                        nextI++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}