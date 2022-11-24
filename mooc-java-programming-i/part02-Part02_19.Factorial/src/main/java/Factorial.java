
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        int multiplication = 1;
        int count = 1;
        
        for(int i = 0; i < number; i++){        
            multiplication *= count;
            count++;
            
            
        }
        System.out.println("Factorial: " + multiplication);
        
    }
}
