package implementation;

import java.util.Scanner;

public class TheHurdleRace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        // your code goes here

        int j = k;
        int sum = 0;
        for(int i = 0;i<height.length;i++){
            sum += Math.max(0,height[i] - j);
            j = Math.max(j,height[i]);
        }
        System.out.println(sum);
    }


}
