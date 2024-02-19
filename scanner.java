import java.util.Scanner;

public class scanner {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        char genger = sc.next().charAt(0);
        long mobile = sc.nextLong();

        System.out.println("Name:"+ name);
        System.out.println("Age:"+ age);
        System.out.println("Gender:"+ genger);
        System.out.println("Mobile NO:"+ mobile);

    }
}
