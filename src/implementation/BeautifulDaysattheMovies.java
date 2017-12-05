package implementation;

import java.util.Scanner;

public class BeautifulDaysattheMovies {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt(),j = scanner.nextInt(),k = scanner.nextInt();
        int cnt = 0;
        for(int c = i;c<=j;c++){
            int rever = 0,ori = c;
            while (ori > 0){
                rever = rever * 10 + ori % 10;
                ori /= 10;
            }
            if(Math.abs(c - rever) % k == 0){
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
