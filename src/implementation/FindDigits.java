package implementation;

import java.util.Scanner;

public class FindDigits {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0;i<t;i++){
            int n = scanner.nextInt();
            int c = 0, ori = n;
            while (n > 0){
                int dig = n % 10;
                n /= 10;
                if(dig > 0 && ori % dig == 0) c++;
            }
            System.out.println(c);
        }
    }
}
