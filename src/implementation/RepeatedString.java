package implementation;

import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();

        long cnt = 0,sa = 0;
        for(char c : s.toCharArray()) if(c == 'a') sa++;

        cnt = sa * (n / s.length());

        int d = (int) (n % s.length());
        for(int i = 0;i<d;i++){
            if(s.charAt(i) == 'a') cnt++;
        }
        System.out.println(cnt);
    }
}
