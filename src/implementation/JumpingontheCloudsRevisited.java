package implementation;

import java.util.Scanner;

public class JumpingontheCloudsRevisited {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }

        int cur = 0,e = 100;
        do{
            cur = (cur + k) % n;
            e--;
            if(c[cur] > 0) e -= 2;
        }while (cur != 0);
        System.out.println(e);

    }

}
