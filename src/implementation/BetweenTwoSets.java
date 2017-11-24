package implementation;

import java.util.Scanner;

public class BetweenTwoSets {
    static int getTotalX(int[] a, int[] b) {
        // Complete this function
        int maxA = 0, minB = 100;
        for(int na : a) maxA = Math.max(maxA,na);
        for(int nb : b) minB = Math.min(minB,nb);

        int i = maxA;
        int cnt = 0;
        while (i <= minB){
            boolean qualify = true;
            for(int na : a){
                if(i % na != 0){
                    qualify = false;
                    break;
                }
            }

            if(qualify){
                for(int nb : b){
                    if(nb % i != 0){
                        qualify = false;
                        break;
                    }
                }

                if(qualify) cnt++;
            }

            i += maxA;
        }
        return cnt;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
