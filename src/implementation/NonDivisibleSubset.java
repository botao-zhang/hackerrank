package implementation;

import java.util.Scanner;

public class NonDivisibleSubset {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),k = scanner.nextInt();

        int[] ks = new int[k];
        for(int i = 0;i<n;i++){
            int num = scanner.nextInt();
            ks[num % k]++;
        }

        int cnt = Math.min(1,ks[0]);
        int i = 1,j = k - 1;
        for(;i < j;i++,j--){
            cnt += Math.max(ks[i],ks[j]);
        }

        if(i == j){
            cnt += Math.min(1,ks[i]);
        }
        System.out.println(cnt);
        return;
    }
}
