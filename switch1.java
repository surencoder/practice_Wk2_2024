import java.util.Scanner;

public class switch1 {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int size = scn.nextInt();

        switch(size){

            case 1:
            System.out.println("exta small");
            break;

            case 2:
            System.out.println("small");
            break;
            default:
            System.out.println("Invalid size");


        }
    }
    
}
