package implementation;

import java.util.Scanner;

public class AppendandDelete {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();

        if(k >= s.length() + t.length()){
            System.out.println("Yes");
            return;
        }

        int matched = 0;
        for(int i = 0;i<s.length() && i < t.length();i++){
            if(s.charAt(i) == t.charAt(i)) matched++;
            else break;
        }

        int minOPs = s.length() - matched + t.length() - matched;

        if(k < minOPs){
            System.out.println("No");
            return;
        }

        k -= minOPs;
        if(k % 2 == 0){
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
        return;
    }
}
