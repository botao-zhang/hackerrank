package implementation;

import java.util.Scanner;

public class ModifiedKaprekarNumbers {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt(),q = scanner.nextInt();
        StringBuilder builder = new StringBuilder();
        for(Integer i = p;i<=q;i++){
            Long sq = (long)i * i;
            String s = sq.toString();
            int ll = s.length() / 2;
            String ls = s.substring(0,ll), rs = s.substring(ll,s.length());
            int ln = ls.isEmpty() ? 0 : Integer.parseInt(ls),rn = rs.isEmpty() ? 0 : Integer.parseInt(rs);

            if(ln + rn == i){
                if(builder.length() > 0) builder.append(' ');
                builder.append(i);
            }
        }
        if(builder.length() == 0) System.out.println("INVALID RANGE");
        else System.out.println(builder);
    }
}
