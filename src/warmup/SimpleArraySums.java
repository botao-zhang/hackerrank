package warmup;

import java.util.Scanner;

public class SimpleArraySums {
    public static class Solution {

        static int simpleArraySum(int n, int[] ar) {
            // Complete this function
            int sum = 0;
            for(int a : ar) sum += a;
            return sum;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] ar = new int[n];
            for(int ar_i = 0; ar_i < n; ar_i++){
                ar[ar_i] = in.nextInt();
            }
            int result = simpleArraySum(n, ar);
            System.out.println(result);
        }
    }
}
