public class switchstatement {
    public static void main(String[] args) {
        
        int day = 5;

        if (day>=4)
        System.err.println("invalid day");

        switch (day) {
            case 1:
            System.out.println("Monday");    
                break;
        case 2:
        System.out.println("Tuesday");
                break;
        case 3:
        System.out.println("Tuesday");
       default:
        break;             

        }

    }
}
