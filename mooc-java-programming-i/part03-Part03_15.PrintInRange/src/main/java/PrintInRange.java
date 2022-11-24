
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
    }
 
    
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        System.out.println("The numbers in the range [" + lowerLimit + ", " + upperLimit + "]");

        int i = 0;

        while(i < numbers.size()){
            if(numbers.get(i) >= lowerLimit && numbers.get(i) <= upperLimit) {
                System.out.println(numbers.get(i));
                i++;
            } else {
                i++;
                continue;
            }
        }
    }
    
}
