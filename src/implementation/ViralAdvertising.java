package implementation;

import java.util.Scanner;

public class ViralAdvertising {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int init = 5,cum = 0;
        for(int i = 0;i<n;i++){
            int like = init / 2;
            cum += like;
            init = like * 3;
        }
        System.out.println(cum);

    }
}
