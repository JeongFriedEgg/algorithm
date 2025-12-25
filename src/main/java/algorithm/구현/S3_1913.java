package algorithm.구현;

import java.io.*;

public class S3_1913 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        int[][] map = new int[N][N];

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        int x = 0, y = 0, dir = 0;
        int targetX = 0, targetY = 0;

        for (int i = N * N; i > 0; i--) {
            map[x][y] = i;

            if (i == K) {
                targetX = x + 1;
                targetY = y + 1;
            }

            if (i == 1) break;

            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx < 0 || ny < 0 || nx >= N || ny >= N || map[nx][ny] != 0) {
                dir = (dir + 1) % 4;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }

            x = nx;
            y = ny;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(map[i][j]).append(" ");
            }
            sb.append("\n");
        }
        sb.append(targetX).append(" ").append(targetY);

        System.out.print(sb);
    }
}
