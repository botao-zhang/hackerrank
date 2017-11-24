package implementation;

import java.util.Scanner;

public class Kangaroo {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
        if(x1 == x2) return "YES";

        if(x1 < x2 && v1 <= v2) return "NO";
        if(x1 > x2 && v1 >= v2) return "NO";

        int dd = Math.max(x1,x2) - Math.min(x1,x2), dv = Math.max(v1,v2) - Math.min(v1,v2);
        return dd >= dv && dd % dv == 0 ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
