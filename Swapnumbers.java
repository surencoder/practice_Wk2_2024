public class Swapnumbers {

    protected static void swapnum(int m, int n ){
        int temp =m;
        m=n;
        n=temp;
        System.out.print("value of m:"+ m + "value of n:"+ n);
        
    }

    public static void main(String[] args) {
        
      int m =9;
      int n =5;
     swapnum(m,n);
        
    }
    
}
