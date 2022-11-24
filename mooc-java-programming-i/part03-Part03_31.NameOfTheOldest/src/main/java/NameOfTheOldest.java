
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String name = "";
        
        while(true){
            String text = String.valueOf(scanner.nextLine());
            if(text.equals("")){
                break;
            } else { 
                String[] pieces = text.split(",");
                int age = Integer.valueOf(pieces[1]);
                if(age > oldest){
                    oldest = age;
                    name = pieces[0];
                } else {
                    continue;
                }
            }        
        }
        System.out.println("Name of the oldest: " + name);

    }
}
