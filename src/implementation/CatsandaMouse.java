package implementation;

import java.util.Scanner;

public class CatsandaMouse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            if(x == y){
                System.out.println("Mouse C");
            }else {
                String r = x > y ? "Cat A" : "Cat B", l = x > y ? "Cat B" : "Cat A";
                int rp = Math.max(x,y), lp = Math.min(x,y);

                if(z > rp){
                    System.out.println(r);
                }else if(z < lp){
                    System.out.println(l);
                }else{
                    if(rp - z == z - lp) System.out.println("Mouse C");
                    else if(rp - z < z - lp){
                        System.out.println(r);
                    }else{
                        System.out.println(l);
                    }
                }

            }


        }
    }
}
