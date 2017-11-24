package implementation;

import java.util.Scanner;

public class BirthdayChocolate {
    static int solve(int n, int[] s, int d, int m){
        if(m > s.length) return 0;
        int cnt = 0, left = 0, right = 0;

        for(int i = 0;i<m-1;i++) right+=s[i];

        int i = m - 1;
        while (i < s.length){
            right+=s[i];
            left+= i - m >= 0 ? s[i - m] : 0;
            if(right - left == d) cnt++;
            i++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
