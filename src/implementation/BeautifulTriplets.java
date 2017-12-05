package implementation;

import java.util.HashSet;
import java.util.Scanner;

public class BeautifulTriplets {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),d = scanner.nextInt();

        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = scanner.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        int cnt = 0;
        for(int i = nums.length - 1;i>=0;i--){
            if(set.contains(nums[i] + d) && set.contains(nums[i] + 2 * d)) cnt++;
            set.add(nums[i]);
        }

        System.out.println(cnt);

    }
}
