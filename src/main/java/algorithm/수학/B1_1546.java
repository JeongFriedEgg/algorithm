package algorithm.수학;

import java.io.*;
import java.util.StringTokenizer;

public class B1_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String scoreLine = br.readLine();
        StringTokenizer st = new StringTokenizer(scoreLine);

        double[] score = new double[n];
        double avg, max = 0, sum = 0;

        for (int i = 0; i < score.length; i++) {
            score[i] = Double.parseDouble(st.nextToken());

            if (score[i] > max)
                max = score[i];
        }

        for (int i = 0; i < score.length; i++) {
            score[i] = score[i]/max * 100;
            sum += score[i];
        }

        avg = sum / n;

        System.out.println(avg);
        br.close();
    }
}