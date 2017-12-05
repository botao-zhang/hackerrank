package implementation;

import java.util.Scanner;

public class ACMICPC {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),k = scanner.nextInt();
        String[] ps = new String[n];
        for(int i = 0;i<n;i++){
            ps[i] = scanner.next();
        }

        int maxS = 0,maxT = 0;
        for(int i = 0;i<n - 1;i++){
            for(int j = i + 1;j<n;j++){
                int know = 0;
                for(int l = 0;l<k;l++){
                    if(ps[i].charAt(l) == '1' || ps[j].charAt(l) == '1') know++;
                }

                if(know > maxS){
                    maxS = know;
                    maxT = 1;
                }else if(know == maxS){
                    maxT++;
                }
            }
        }

        System.out.println(maxS);
        System.out.println(maxT);
    }
}
