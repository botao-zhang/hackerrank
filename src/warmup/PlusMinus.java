package warmup;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        double[] result = count(ar);
        for(double i : result) System.out.println(i);

    }

    private static double[] count(int[] ar) {
        double[] ret = new double[3];
        for(int n : ar){
            if(n > 0) ret[0]++;
            else if(n < 0) ret[1]++;
            else ret[2]++;
        }

        for(int i = 0;i<=2;i++) ret[i] /= ar.length;
        return ret;
    }
}
