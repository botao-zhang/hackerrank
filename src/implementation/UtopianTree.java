package implementation;

import java.util.Scanner;

public class UtopianTree {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        for(int i =0;i<k;i++){
            int n = scanner.nextInt();
            int cnt = 1;
            for(int j = 0;j<n;j++){
                if(j % 2 == 0) cnt <<=1;
                else cnt += 1;
            }
            System.out.println(cnt);
        }
    }
}
