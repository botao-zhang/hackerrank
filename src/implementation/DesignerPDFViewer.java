package implementation;

import java.util.Scanner;

public class DesignerPDFViewer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();

        int mh = 0;
        for(char c : word.toCharArray()){
            mh = Math.max(mh,h[c - 'a']);
        }

        System.out.println(mh * word.length());
    }
}
