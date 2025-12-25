package algorithm.구현;

import java.io.*;
import java.util.*;

public class S3_10157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int C = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine());

        if (K > C * R) {
            System.out.println(0);
            return;
        }

        int[][] map = new int[C][R];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int x = 0, y = 0, dir = 0;
        for (int i = 1; i < K; i++) {
            map[x][y] = i;

            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx < 0 || ny < 0 || nx >= C || ny >= R || map[nx][ny] != 0) {
                dir = (dir + 1) % 4;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }

            x = nx;
            y = ny;
        }

        System.out.println((x + 1) + " " + (y + 1));
    }
}