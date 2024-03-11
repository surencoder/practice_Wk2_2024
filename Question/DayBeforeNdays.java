package Question;

import java.util.Scanner;

public class DayBeforeNdays {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();


        int z =y%7;
        int ans = x-y;

        if (ans >0){
            System.out.println(ans);
        }else 
        {
            System.out.println(ans +7);
        }




    }
    
}
