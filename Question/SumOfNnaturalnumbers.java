package Question;

import java.util.Scanner;

public class SumOfNnaturalnumbers {
    public static void main(String[] args) {
        
        // sum = n*(n+1)/2

        Scanner sc = new Scanner(System.in);
        System.out.println("Print the number you want to find the n natural numbers");
        int n = sc.nextInt();
        int sum;
        sum = n*(n+1)/2;
        System.out.println("N natural number is :"+ sum);

    }
    
}
