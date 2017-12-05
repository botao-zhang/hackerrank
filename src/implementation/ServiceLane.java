package implementation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class ServiceLane {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),t = scanner.nextInt();
        int[] ws = new int[n];
        for(int i = 0;i<n;i++) ws[i] = scanner.nextInt();

        int[] t2 = new int[n + 1], t1 = new int[n + 1];
        Arrays.fill(t2,Integer.MAX_VALUE);
        Arrays.fill(t1,Integer.MAX_VALUE);
        for(int i = n - 1;i>=0;i--){
            t2[i] = t2[i + 1];
            t1[i] = t1[i + 1];
            if(ws[i] == 2){
                t2[i] = i;
            }else if(ws[i] == 1){
                t1[i] = i;
            }
        }

        for(int i = 0;i<t;i++){
            int in = scanner.nextInt(),out = scanner.nextInt();
            if(t1[in] <= out) System.out.println("1");
            else if(t2[in] <= out) System.out.println("2");
            else System.out.println("3");
        }
    }
}
