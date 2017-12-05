package implementation;

import java.util.Scanner;

public class BiggerisGreater {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0;i<t;i++){
            String w = scanner.next();
            int[] cnts = new int[26];
            boolean violate = false;
            int j = w.length() - 1;
            for(;j>=0;j--){
                char c = w.charAt(j);
                cnts[c - 'a']++;
                for(int k = c - 'a' + 1;k<26;k++){
                    if(cnts[k] > 0){
                        cnts[k]--;
                        violate = true;
                        StringBuilder word = new StringBuilder(w.substring(0,j));
                        word.append((char)('a' + k));
                        for(int m = 0;m<26;m++){
                            for(int q = 0;q<cnts[m];q++){
                                word.append((char) ('a' + m));
                            }
                        }
                        System.out.println(word.toString());
                        break;
                    }
                }
                if(violate) break;
            }
            if(!violate) System.out.println("no answer");
        }


    }
}
