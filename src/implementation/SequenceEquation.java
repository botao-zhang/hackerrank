package implementation;

import java.util.Arrays;
import java.util.Scanner;

public class SequenceEquation {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n + 1];
        for(int i = 1;i<=n;i++){
            arr[i] = scanner.nextInt();
        }

        int[] next = new int[n + 1];
        for(int i = 1;i<arr.length;i++){
            next[arr[i]] = i;
        }
        System.out.println("next = " + Arrays.toString(next));

        int[] nextnext = new int[n + 1];
        for(int i = 1;i<next.length;i++){
            nextnext[i] = next[next[i]];
        }
        System.out.println("next next = " + Arrays.toString(nextnext));

        for(int i = 1;i<nextnext.length;i++){
            System.out.println(nextnext[i]);
        }
    }
}
