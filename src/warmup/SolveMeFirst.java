package warmup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SolveMeFirst {
    public static class Solution {

        static int solveMeFirst(int a, int b) {
            // Hint: Type return a+b; below
            return a + b;
        }


        public static void main(String[] args) throws FileNotFoundException {
            if(args.length > 0) {
                System.setIn(new FileInputStream(args[0]));
            }
            Scanner in = new Scanner(System.in);
            int a;
            a = in.nextInt();
            int b;
            b = in.nextInt();
            int sum;
            sum = solveMeFirst(a, b);
            System.out.println(sum);
        }
    }
}
