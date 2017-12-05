package implementation;

import java.util.Arrays;
import java.util.Scanner;

public class PickingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] cnt = new int[100];
        for(int i = 0;i<a.length;i++){
            cnt[a[i]]++;
        }
        int max = 0;
        for(int i = 0;i<cnt.length - 1;i++){
            max = Math.max(max,cnt[i] + cnt[i + 1]);
        }
        System.out.println(max);
        return;
    }
}
