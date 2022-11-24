
import java.util.Scanner;
import sun.awt.image.BufferedImageGraphicsConfig;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
    }

    public static void divisibleByThreeInRange(int beginning, int end){
        
        
        while(beginning != (end + 1)){
            if(beginning % 3 == 0){
                System.out.println(beginning);
            }           
            beginning++;
        }
        
    }
}
