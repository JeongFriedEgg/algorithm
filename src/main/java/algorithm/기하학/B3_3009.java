package algorithm.기하학;

import java.io.*;
import java.util.*;

public class B3_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int final_x = 0;
        int final_y = 0;

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            final_x = final_x ^ x;
            final_y = final_y ^ y;
        }

        System.out.println(final_x + " " + final_y);
    }
}
