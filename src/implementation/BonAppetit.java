package implementation;

import java.util.Scanner;

public class BonAppetit {
    static int bonAppetit(int n, int k, int b, int[] ar) {
        // Complete this function
        int sum = 0;
        for(int i : ar) sum += i;
        if(sum / 2 == b) return ar[k] / 2;
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int result = bonAppetit(n, k, b, ar);
        //System.out.println("ret = " + result);
        if(result == 0) System.out.println("Bon Appetit");
        else System.out.println(result);
    }

}
