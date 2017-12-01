package implementation;

import java.util.Scanner;

public class SherlockandSquares {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0;i<t;i++){
            int from = scanner.nextInt();
            int to = scanner.nextInt();

            int sq1 = (int) Math.sqrt(from),sq2 = (int) Math.sqrt(to);
            if(sq1 * sq1 < from) sq1++;

            int gap = sq2 - sq1 + 1;
            System.out.println(gap);
        }

        return;
    }
}
