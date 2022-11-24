
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        
        while(true){
            String text = String.valueOf(scanner.nextLine());
            if(text.equals("")){
                break;
            } else { 
                String[] pieces = text.split(",");
                int age = Integer.valueOf(pieces[1]);
                if(age > oldest){
                    oldest = age;
                } else {
                    continue;
                }
            }        
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
