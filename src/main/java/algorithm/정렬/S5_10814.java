package algorithm.정렬;

import java.io.*;
import java.util.StringTokenizer;

public class S5_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder[] p = new StringBuilder[201];
        for (int i = 0; i < 201; i++) {
            p[i] = new StringBuilder();
        }

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            p[age].append(age).append(' ').append(name).append('\n');
        }

        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 200; i++) {
            result.append(p[i]);
        }

        System.out.println(result);
    }
}
