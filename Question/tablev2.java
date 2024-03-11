package Question;

import java.util.Scanner;

public class tablev2 {

    public static void utility(int n1, int n2){

        int j =n1-n2;
        
        for (int i=1; i<=10; i++){
            System.out.print(i*j+" ");
        }

    }

    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while(t-->0){
        int n1= scn.nextInt();
        int n2 = scn.nextInt();
        utility(n1, n2);
        System.out.println();
    }
    scn.close();

    }
    
}
