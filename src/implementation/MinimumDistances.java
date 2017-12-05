package implementation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class MinimumDistances {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        int min = -1;
        for(int i = A.length - 1;i>=0;i--){
            Integer last = map.get(A[i]);
            if(last != null){
                if(min == -1 || min > last - i){
                    min = last - i;
                }
            }
            map.put(A[i],i);
        }
        System.out.println(min);
        return;
    }
}
