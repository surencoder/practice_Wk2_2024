package Question;

import java.util.Scanner;

public class printnumbersrevers {

public static void reversenumber(int n){     
   While(n>=0){
    System.out.print(x+ " ");
    n--;
   }
}

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int t =scn.nextInt();
        while (t-->0){
            int n = scn.nextInt();
            reversenumber(n);
            System.out.println();
        }
        scn.close();
    }
    
}
