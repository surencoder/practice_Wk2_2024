public class break1 {
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              continue; // continue - will skip only this iteration and keep the running 
                     // break - will stop the iteration, the control is give the for statement again 
            }
            System.out.println(i);
        }
   }   
        
}