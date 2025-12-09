package algorithm.구현;

import java.io.*;

public class B3_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nums = new int[9];
        for (int i = 0; i < 9; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        int max = nums[0];
        int count = 1;

        for (int i = 1; i < 9; i++) {
            if (nums[i] > max) {
                max = nums[i];
                count = i+1;
            }
        }

        bw.write(max + "\n");
        bw.write(count + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
