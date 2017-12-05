package implementation;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class ClimbingtheLeaderboard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i = 0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i = 0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }

        // Write Your Code Here
        Stack<Integer> stack = new Stack<>();
        stack.push(scores[0]);
        for(int s : scores){
            if(s < stack.peek()) stack.push(s);
        }

        long sum = 0;

        for(int i = 0;i<alice.length;i++){
            sum = alice[i];
            while (!stack.isEmpty() && sum >= stack.peek()){
                stack.pop();
            }

            System.out.println(stack.size() + 1);
        }

        in.close();
    }
}
