package implementation;

import java.util.Scanner;

public class QueenAtack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int rQueen = in.nextInt();
        System.out.println("rq = " + rQueen + " n = " + n + " k = " + k);

        int cQueen = in.nextInt();
        int r = n - cQueen, l = cQueen - 1, d = rQueen - 1, u = n - rQueen;
        int ul = Math.min(l,u),ur = Math.min(u,r),dl = Math.min(d,l),dr = Math.min(d,r);
        //System.out.println(ul + ", " + l + ", " + u);

        //System.out.println((ul + ur + dl + dr + d + l + u + r));
        for(int a0 = 0; a0 < k; a0++){
            int rObstacle = in.nextInt();
            int cObstacle = in.nextInt();
            // your code goes here
            if(Math.abs(rObstacle) == Math.abs(cObstacle)){
                System.out.println("ro = " + rObstacle + " co = " + cObstacle);
            }
            if(rObstacle == rQueen){
                if(cObstacle > cQueen){
                    r = Math.min(r,cObstacle - 1 - cQueen);
                }else{
                    l = Math.min(l,cQueen - cObstacle - 1);
                }
            }else if(cObstacle == cQueen){
                if(rObstacle > rQueen){
                    u = Math.min(u,rObstacle - 1 - rQueen);
                }else{
                    d = Math.min(d,rQueen - rObstacle - 1);
                }
            }else if(rObstacle - rQueen == cObstacle - cQueen){
                System.out.println("updating ul = " + ul + " dr = " + dr);
                if(rObstacle > rQueen){
                    ur = Math.min(ur,rObstacle - 1 - rQueen);
                }else{
                    dl = Math.min(dl,rQueen - rObstacle - 1);
                }
            }else if(rObstacle - rQueen == cQueen - cObstacle){
                System.out.println("updating ur = " + ur + " dl = " + dl);
                if(rObstacle > rQueen){
                    ul = Math.min(ul,rObstacle - 1 - rQueen);
                }else{
                    dr = Math.min(dr,rQueen - (rObstacle + 1));
                }
            }
        }
        System.out.println((ul + ", " + u + ","+ur));
        System.out.println((l + ", " +r));
        System.out.println((dl + ", " + d + ","+dr));

        System.out.println((ul + ur + dl + dr + d + l + u + r));
    }
}
