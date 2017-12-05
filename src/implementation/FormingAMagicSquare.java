package implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FormingAMagicSquare {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for(int s_i=0; s_i < 3; s_i++){
            for(int s_j=0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
            }
        }

        //  Print the minimum cost of converting 's' into a magic square
        int[] left = new int[]{2,4,6,8};
        int minDiff = Integer.MAX_VALUE;
        for(int leftMost : left){
            int[] right = new int[]{2,8};
            if(leftMost == 2 || leftMost == 8){
                right = new int[]{4,6};
            }

            for(int rightMost : right){
                int[][] magic = new int[][]{{leftMost,15 - leftMost - rightMost,rightMost},{5 - leftMost + rightMost ,5, 5 - rightMost + leftMost}, {10 - rightMost,leftMost + rightMost - 5,10 - leftMost}};

                int diff = 0;

                for(int i = 0;i<3;i++){
                    for(int j = 0;j<3;j++){
                        diff += Math.abs(s[i][j] - magic[i][j]);
                    }
                }
                minDiff = Math.min(diff,minDiff);
            }
        }

        System.out.println(minDiff);
    }
}
