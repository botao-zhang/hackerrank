package implementation;

import java.util.Scanner;

public class CircularArrayRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        k = k % a.length;
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();

            if(m >= k){
                System.out.println(a[m - k]);
            }else{
                int shift = k - m;
                System.out.println(a[a.length - shift]);
            }

        }


    }
}
