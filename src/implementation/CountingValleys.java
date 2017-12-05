package implementation;

import java.util.Scanner;

public class CountingValleys {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        int result = solve(n, s);
        System.out.println(result);
    }

    private static int solve(int n, String s) {
        if(s.isEmpty()) return 0;
        int v = 0, h = 0;
        boolean isV = false;
        for(char c : s.toCharArray()){
            if(c == 'U') h++;
            else h--;

            if(h == 0){
                if(isV) v++;
            }

            if(h == -1) isV = true;
            else if(h == 1) isV = false;
        }
        return v;
    }
}
