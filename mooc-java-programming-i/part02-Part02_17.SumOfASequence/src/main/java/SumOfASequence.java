
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");
        int number = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int count = 0;
        
        for(int i = 0; i < number; i++){
            System.out.println(sum);
            count++;
            sum += count;
        }
        System.out.println("The sum is " + sum);
        
    }
}
