package Question;

import java.util.Scanner;

public class largestdigitOfaNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("NUmber: ");
        int n = sc.nextInt();

        int y = Math.abs(n);

        int num = y%10;
        System.out.println("largest number is :"+ num);



    }
    
}
