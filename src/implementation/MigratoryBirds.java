package implementation;

import java.util.Scanner;

public class MigratoryBirds {
    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        int[] cnt = new int[5];
        for(int a : ar) cnt[a - 1]++;

        int max = Integer.MIN_VALUE,id = -1;
        for(int i = 0;i<5;i++){
            if(cnt[i] > max){
                max = cnt[i];
                id = i + 1;
            }
        }
        return id;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
