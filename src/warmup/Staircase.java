package warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        List<String> lines = draw(a);
        for(String line : lines) System.out.println(line);
    }

    private static List<String> draw(int a) {
        List<String> ret = new ArrayList<>();
        for(int i = 0;i<a;i++){
            StringBuilder stringBuilder = new StringBuilder();
            for(int j = 0;j<a - i - 1;j++) stringBuilder.append(' ');
            for(int j = 0;j<i + 1;j++) stringBuilder.append('#');
            ret.add(stringBuilder.toString());
        }
        return ret;
    }
}
