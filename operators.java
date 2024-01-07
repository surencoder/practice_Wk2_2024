public class operators {

    public static void main(String[] args) {
        // Assignment operators = 

        //Arthmetic operators ( +, -, *, /, %)

        // relational operators:
        // == equals to 
        // != not equal to, >,<,>=,<=

        double a = 8.8;
        double b = 9.9;

        boolean result = a!=b;
        System.out.println(result);

        int x = 56;
        int y = 77;
        int result1 = x+y;
        System.out.println(result1);

        //logical operators 
        // and- &, or-|, not -!

        int z = 88;
        int k = 99;
        boolean result2 = x<y && k>z;
        boolean result3 = x<y || k>z;
        System.out.println(!result3);
        System.out.println(result3);
        
    }
    
}
