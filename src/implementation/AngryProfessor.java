package implementation;

import java.util.Scanner;

public class AngryProfessor {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0;i<t;i++){
            int n = scanner.nextInt(),k = scanner.nextInt();

            for(int j = 0;j<n;j++){
                if(scanner.nextInt() <= 0) k--;
            }
            String str = k > 0 ? "YES":"NO";
            System.out.println(str);
        }

    }
}
