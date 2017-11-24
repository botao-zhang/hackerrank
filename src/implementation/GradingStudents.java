package implementation;

import java.util.Scanner;

public class GradingStudents {
    static int[] solve(int[] grades){
        int[] ret = new int[grades.length];
        for(int i = 0;i<grades.length;i++){
            int r = grades[i] % 5;
            if(grades[i] < 38 || r < 3) ret[i] = grades[i];
            else{
                ret[i] = grades[i] + 5 - r;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


    }
}
