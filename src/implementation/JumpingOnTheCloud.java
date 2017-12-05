package implementation;

import java.util.Scanner;

public class JumpingOnTheCloud {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }

        int j = 0, cur = 0;
        while(cur < c.length - 1){
            j++;
            if(cur + 2 >= c.length - 1) break;

            if(c[cur + 2] == 1) cur++;
            else cur += 2;
        }
        System.out.println(j);
    }
}
