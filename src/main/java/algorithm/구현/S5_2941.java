package algorithm.구현;

import java.io.*;

public class S5_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        String[] croatianAlphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String croatia : croatianAlphabets) {
            S = S.replace(croatia, "a");
        }

        System.out.println(S.length());
    }
}
