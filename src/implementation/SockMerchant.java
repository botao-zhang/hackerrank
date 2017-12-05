package implementation;

import java.util.HashSet;
import java.util.Scanner;

public class SockMerchant {
    static int sockMerchant(int n, int[] ar) {
        // Complete this function
        HashSet<Integer> set = new HashSet<>();

        int pair = 0;
        for(int r : ar){
            if(set.remove(r)){
                pair++;
            }else{
                set.add(r);
            }
        }
        return pair;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
