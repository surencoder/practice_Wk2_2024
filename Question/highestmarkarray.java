package Question;

public class highestmarkarray {
    public static void main(String[] args) {
        
        int[] marks= {99, 86, 75,66, 52};

        int highestmark = maximum(marks);
        System.out.print("Highestmark is"+ hightmark);
    }
    public static int maximum(int[] numbers){
        int maxSoFar = numbers[0];

        for (int num : numbers){

            if (num > maxSoFar){
                maxSoFar = num;
            }

        }
        return maxSoFar;

    }
    
}
