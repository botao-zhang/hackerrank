package implementation;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExtraLongFactorials {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        java.math.BigDecimal bigDecimal = new java.math.BigDecimal(1);
        int n = scanner.nextInt();
        for(int i = 1;i<=n;i++){
            bigDecimal = bigDecimal.multiply(new java.math.BigDecimal(i));
        }

        System.out.println(bigDecimal.toBigInteger());
    }
}
