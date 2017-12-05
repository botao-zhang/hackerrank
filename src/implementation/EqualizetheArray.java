package implementation;

import java.util.Scanner;

public class EqualizetheArray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int max = 0;
        int[] ns = new int[101];
        for(int i = 0;i<n;i++){
            int num = scanner.nextInt();
            max = Math.max(max,++ns[num]);
        }
        System.out.println((n - max));
        return;

    }
}
