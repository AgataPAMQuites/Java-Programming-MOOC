
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
                
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999){
                break;
            }
            numbers.add(input);
        }
        
        int smallest = numbers.get(0);
        
        for(int i = 1; i < numbers.size(); i++){
            if( smallest < numbers.get(i)){
                continue;
            } else {
                smallest = numbers.get(i);
            }    
                
           
        }
        System.out.println("Smallest number: " + smallest);
        
        for(int index = 0; index < numbers.size(); index++){
            if(numbers.get(index) == smallest){
                System.out.println("Found at index: " + index);
                index++;
            }
        }
        
        
        

        
    }
}
