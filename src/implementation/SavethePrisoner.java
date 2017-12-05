package implementation;

import java.util.Scanner;

public class SavethePrisoner {
    static int saveThePrisoner(int n, int m, int s){
        // Complete this function
        int step = m - 1;
        int idx = (s - 1 + step) % n;
        return idx + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            int result = saveThePrisoner(n, m, s);
            System.out.println(result);
        }
    }
}
