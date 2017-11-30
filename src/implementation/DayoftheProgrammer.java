package implementation;

import java.util.Scanner;

public class DayoftheProgrammer {
    static int[] base = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};

    static String solve(int year){
        // Complete this function
        StringBuilder ret = new StringBuilder();
        int left = 256;

        for(int i = 0;i<12;i++){
            int cur = base[i];
            if(i == 1){
                if(year == 1918) cur = 15;
                else if(year < 1918 && year % 4 == 0) cur++;
                else{
                    if(year % 400 == 0) cur++;
                    else if(year % 4 == 0 && year % 100 != 0) cur++;
                }
            }

            if(left <= cur){
                int dd = left;
                if(dd < 10) ret.append(0);
                ret.append(dd);
                ret.append('.');
                if(i + 1 < 10) ret.append(0);
                ret.append(i + 1);
                ret.append('.');
                ret.append(year);
                break;
            }
            left -= cur;
        }

        return ret.toString();

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
