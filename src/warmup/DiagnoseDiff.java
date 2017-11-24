package warmup;

import java.util.Scanner;

public class DiagnoseDiff {
    private static class Solution{
        private static int calc(int[][] nums){
            int left = 0,right = 0;
            for(int i = 0;i<nums.length;i++){
                left += nums[i][i];
                right += nums[i][nums.length - 1 - i];
            }

            return Math.abs(left - right);
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int k = 0;
            int[][] ar = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    ar[i][j] = in.nextInt();
                }

            }
            int result = calc(ar);
            System.out.println(result);
        }
    }

}
