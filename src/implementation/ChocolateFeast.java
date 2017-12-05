package implementation;

import java.util.Scanner;

public class ChocolateFeast {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0;i<t;i++){
            int n = scanner.nextInt(),c = scanner.nextInt(),m = scanner.nextInt();

            int cnt = n / c, total = cnt;
            while (cnt >= m){
                int div = cnt / m;
                cnt = cnt - div * m + div;
                total += div;
            }
            System.out.println(total);
        }
    }
}
