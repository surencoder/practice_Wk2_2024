package Question;

import java.util.Scanner;

public class NthTermOfanArthmeticProgression {


    public static int nthterm(int a, int b, int c){
        int ans =a+(c-1)*b; // arthmetic progression
      //  int ans = a*(int)(Math.pow(r, n-1)); --> Geometric Progression. 
        return ans;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

      System.out.println(nthterm(a,b,c));

    }
    
}
