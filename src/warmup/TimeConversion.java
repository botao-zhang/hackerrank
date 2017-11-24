package warmup;

import java.util.Scanner;

public class TimeConversion {
    static String timeConversion(String s) {
        // Complete this function
        int h = Integer.parseInt(s.substring(0,2));

        boolean morning = s.charAt(s.length() - 2) == 'A';
        h = h % 12;
        if(!morning) h += 12;

        StringBuilder builder = new StringBuilder();
        if(h < 10) builder.append('0');
        builder.append(h);
        builder.append(s.substring(2,s.length() - 2));

        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
