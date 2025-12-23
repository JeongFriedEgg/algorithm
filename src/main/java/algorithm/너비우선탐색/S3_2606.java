package algorithm.너비우선탐색;

import java.util.*;
import java.io.*;

public class S3_2606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        ArrayList<Integer>[] adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }

        System.out.println(bfs(adj, n));
    }

    static int bfs(ArrayList<Integer>[] adj, int n) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];
        int count = 0;

        queue.add(1);
        visited[1] = true;

        while (!queue.isEmpty()) {
            int curr = queue.poll();

            for (int next : adj[curr]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                    count++;
                }
            }
        }

        return count;
    }
}
