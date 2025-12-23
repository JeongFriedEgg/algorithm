package algorithm.깊이우선탐색;

import java.util.*;
import java.io.*;

public class S3_2606 {
    static ArrayList<Integer>[] adj;
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        adj = new ArrayList[n + 1];
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

        visited = new boolean[n + 1];
        dfs(1);

        System.out.println(count - 1);
    }

    static void dfs(int node) {
        visited[node] = true;
        count++;

        for (int next : adj[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}
