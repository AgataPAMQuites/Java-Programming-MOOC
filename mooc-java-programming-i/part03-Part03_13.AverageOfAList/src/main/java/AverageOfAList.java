
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<>();
                       
        int sum = 0; 
        int count = 0;
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            } 
            sum += input;
            count++;
        }
        double average = (double) sum / count;
        System.out.println("Average: " + average);                
    }
}
