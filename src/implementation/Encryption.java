package implementation;

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        String in = scanner.next();
        int l = in.length(), sqr = (int) Math.sqrt(l);
        int col = sqr * sqr == l ? sqr : sqr + 1;
        System.out.println("l = " + l + " r = " + sqr + " col = " + col);

        StringBuilder builder = new StringBuilder();

        for(int i = 0;i<col;i++){
            if(builder.length() > 0) builder.append(' ');
            int cur = i;
            while (cur < l){
                builder.append(in.charAt(cur));
                cur += col;
            }
        }
        System.out.println(builder.toString());

    }
}
