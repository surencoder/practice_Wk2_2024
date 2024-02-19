import java.util.Scanner;

public class scannerread {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();

        Scanner scn1 = new Scanner(System.in);
        String name = scn1.nextLine();

        System.out.print(age + name);
    }



}
