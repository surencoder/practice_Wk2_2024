package Question;

import java.util.Scanner;

public class simplecalci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an operation: \n 1.Addition \n 2.Sub \n 3.Multiplication \n 4.Division");
        System.out.println("Enter here:");
        int operation = input.nextInt();
        
        if( operation !=1 && operation !=2 && operation !=3 && operation !=4){
            System.out.println("Enter operation is:"+ "Invalid operation");
        } else {
                
            Scanner fnum = new Scanner(System.in);
            System.out.println("Enter 1st number: ");
            int a1 = fnum.nextInt();
            System.out.println("Enter 2nd number: ");
            int a2 = fnum.nextInt();
            if (operation ==1 ){
                System.out.print("Answer is:"+ a1 + a2);
            } else if (operation ==2 ){
                System.out.print(a1 - a2);
             }else if (operation ==3 ){
            System.out.print("Answer is:"+ a1 * a2);
            }else if (operation ==4 ){
            System.out.print("Answer is:"+ a1 / a2);                                        


    }
    
}
    }
}
