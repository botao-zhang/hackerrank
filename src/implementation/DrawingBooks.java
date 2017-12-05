package implementation;

import java.util.Scanner;

public class DrawingBooks {
    static int solve(int n, int p){
        // Complete this function
        int front = p - 1,back = n - p - n % 2;
        return (Math.min(front,back) + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
