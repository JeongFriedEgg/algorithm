package algorithm.자료구조;

import java.io.*;
import java.util.Stack;

public class S4_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean isVPS = true;

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                if (c == '(') {
                    stack.push(c);
                } else if (stack.empty()) {
                    isVPS = false;
                    break;
                } else {
                    stack.pop();
                }
            }

            if (isVPS && stack.empty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
