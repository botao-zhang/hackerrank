package warmup;

import java.util.Scanner;

public class MinMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        long min = Integer.MAX_VALUE,max = Integer.MIN_VALUE,sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }

        System.out.println(sum - max + " " + (sum - min));
    }
}
