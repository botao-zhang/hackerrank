package implementation;

import java.util.Scanner;

public class TheTimeinWords {
    private static String[] digits = new String[]{"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve", "thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};

    private static String translate(int m){
        if(m == 20){
            return "twenty minutes ";
        }
        if(m == 1){
            return "one minute ";
        }

        if(m > 20){
            return "twenty " + digits[m - 20] + " minutes ";
        }

        return digits[m] + " minutes ";
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt(),m = scanner.nextInt();
        if(m == 0){
            System.out.println(digits[h] + " o' clock");
            return;
        }

        if(m == 30){
            System.out.println("half past " + digits[h]);
            return;
        }

        if(m == 15){
            System.out.println("quarter past " + digits[h]);
            return;
        }

        if(m == 45){
            System.out.println("quarter to " + digits[h+1]);
            return;
        }

        String min = "";
        if(m < 30){
            min = translate(m) + "past " + digits[h];
        }else{
            min = translate(60 - m) + "to " + digits[h + 1];
        }
        System.out.println(min);
    }
}
