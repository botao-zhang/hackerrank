package implementation;

import java.util.Scanner;

public class BreakingTheRecords {
    static int[] getRecord(int[] s){
        int[] ret = new int[]{0,0};
        if(s.length == 0) return ret;

        int max = s[0],min = s[0];

        for(int score : s){
            if(score > max){
                ret[0]++;
                max = score;
            }else if(score < min){
                ret[1]++;
                min = score;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
