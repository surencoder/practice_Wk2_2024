package Question;

import java.util.Scanner;

public class coutofnumbers {

    public static void countdigits(int n){

        int count =0;
        while (n>0){
            n=n/10;
            count = count +1;
        }System.out.print(count);
    }

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0){
            int n = scn.nextInt();
            countdigits(n);
            System.out.println();
        } scn.close();
    }
    
}
