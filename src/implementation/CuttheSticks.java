package implementation;

import java.util.Scanner;

public class CuttheSticks {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ss = new int[n];

        int min = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            ss[i] = scanner.nextInt();
            min = Math.min(min,ss[i]);
        }

        int left = n;
        while (left > 0){
            System.out.println(left);
            int nmin = Integer.MAX_VALUE;
            for(int i = 0;i<ss.length;i++){
                if(ss[i] > 0){
                    ss[i] -= min;
                    if(ss[i] <= 0) left--;
                    else nmin = Math.min(nmin,ss[i]);
                }
            }
            min = nmin;
        }
        return;
    }
}
