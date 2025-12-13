package algorithm.기하학;

import java.io.*;
import java.util.*;

public class S2_2477 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        int[] lengths = new int[6];

        int maxW = 0;
        int maxH = 0;

        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int dir = Integer.parseInt(st.nextToken());
            int len = Integer.parseInt(st.nextToken());

            lengths[i] = len;

            if (dir == 1 || dir == 2) {
                if (len > maxW) {
                    maxW = Math.max(maxW, len);
                }
            } else {
                if (len > maxH) {
                    maxH = Math.max(maxH, len);
                }
            }
        }

        int totalArea = maxW * maxH;

        int smallArea = Integer.MAX_VALUE;

        for (int i = 0; i < 6; i++) {
            int currentArea = lengths[i] * lengths[(i + 1) % 6];

            smallArea = Math.min(smallArea, currentArea);
        }

        int finalArea = totalArea - smallArea;
        System.out.println(finalArea * K);
    }
}
