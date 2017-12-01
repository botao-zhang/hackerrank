package implementation;

import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int rd = scanner.nextInt(),rm = scanner.nextInt(),ry = scanner.nextInt();
        int ed = scanner.nextInt(),em = scanner.nextInt(),ey = scanner.nextInt();

        if(ry > ey){
            System.out.println(10000);
            return;
        }else if(ry == ey) {

            if (rm > em) {
                int fine = (rm - em) * 500;
                System.out.println(fine);
                return;
            }else if(rm == em) {
                if (rd > ed) {
                    int fine = (rd - ed) * 15;
                    System.out.println(fine);
                    return;
                }
            }
        }

        System.out.println(0);
        return;

    }
}
