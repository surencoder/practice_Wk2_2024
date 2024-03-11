package Question;

import java.util.Scanner;

public class tables {

    public static void tablesfornum(int n){
        int m =10;
       for (int i=1; i<=m; i++){
        System.out.println(i*n);
       }
    }
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int t =scn.nextInt();
        while (t-->0){
            int n =scn.nextInt();
           tablesfornum(n); 
           System.out.println();
        }
        scn.close();
    }
    
}
