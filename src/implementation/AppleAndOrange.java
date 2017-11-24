package implementation;

import java.util.Scanner;

public class AppleAndOrange {
    private static int[] solve(int s,int t,int a,int b,int[] ad,int[] od){
        int app = 0, ora = 0;

        for(int d : ad){
            int p = a + d;
            if(p >= s && p <= t) app++;
        }

        for(int d : od){
            int p = b + d;
            if(p >= s && p <= t) ora++;
        }

        return new int[]{app,ora};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }

        int[] ret = solve(s,t,a,b,apple,orange);
        System.out.println(ret[0]);
        System.out.println(ret[1]);
    }
}
